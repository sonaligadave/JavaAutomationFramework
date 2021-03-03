package Actions;

import lombok.Data;

@Data
public class UserAPI {
    private String body = "";

    public String requestCreation() {
        return body = "query {\n" +
                "  user(id: 1) {\n" +
                "    posts {\n" +
                "      data {\n" +
                "        id\n" +
                "        title\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}";

    }

}
