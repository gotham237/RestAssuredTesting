package api.actions;

import api.ApiRequest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utils.ConfigLoader;

import java.util.HashMap;
import java.util.Map;

public class OAuthApi {

    public Response getCourseDetails() {
        Map<String, String> formParams = new HashMap<>();
        formParams.put("client_id", ConfigLoader.getInstance().getClientId());
        formParams.put("client_secret", ConfigLoader.getInstance().getClientSecret());
        formParams.put("grant_type", "client_credentials");
        formParams.put("scope", "trust");

        Response response = ApiRequest.post("/oauthapi/oauth2/resourceOwner/token", formParams);

        JsonPath jsonPath = new JsonPath(response.asString());
        String accessToken = jsonPath.getString("access_token");

        return ApiRequest.get("/oauthapi/getCourseDetails", accessToken);
    }
}
