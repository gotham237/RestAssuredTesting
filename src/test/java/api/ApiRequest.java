package api;

import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiRequest extends SpecBuilder {

    public static Response post(String endpoint, Map<String, String> formParams) {
        return given(getRequestSpec())
                .formParams(formParams)
                .when()
                .post(endpoint)
                .then()
                .spec(getResponseSpec())
                .extract().response();
    }

    public static Response get(String endpoint, String accessToken) {
        return given(getRequestSpec())
                .queryParam("access_token", accessToken)
                .when()
                .get(endpoint)
                .then()
                .spec(getResponseSpec())
                .extract().response();
    }
}

