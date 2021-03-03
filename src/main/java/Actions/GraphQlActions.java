package Actions;

import io.restassured.http.Header;

import static io.restassured.RestAssured.given;

public class GraphQlActions {
        private  static final String url = "https://graphqlzero.almansi.me/api";
        private UserAPI userAPI = new UserAPI();
    public String postUser(){
        userAPI.requestCreation();
        String jsonStringResponse= given()
                .header(new Header("Content-type", "application/json"))
                .header("yourheader","value-header")
                .baseUri(url).log().all()
                .body(userAPI.getBody())
                .post().asString();
        return jsonStringResponse;
    }
}
