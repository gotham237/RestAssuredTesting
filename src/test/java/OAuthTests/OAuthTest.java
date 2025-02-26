package OAuthTests;

import api.actions.OAuthApi;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class OAuthTest {

    @Test
    public void shouldGetCourseDetailsUsingOAuth() {
        OAuthApi oAuthApi = new OAuthApi();

        Response response = oAuthApi.getCourseDetails();
        JsonPath jsonPath = new JsonPath(response.asString());

        //Assert.assertEquals(jsonPath.getInt("courses.size()"), 3);
    }
}
