package APITest;

import Actions.GraphQlActions;
import org.testng.annotations.Test;


public class GraphQLApiTest {

    @Test
    public void postCallTest() {
        GraphQlActions graphQlActions = new GraphQlActions();
        graphQlActions.postUser();
    }

    @Test
    public void postCallTestNegative() {

    }
}
