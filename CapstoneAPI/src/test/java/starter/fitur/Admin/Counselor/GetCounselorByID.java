package starter.fitur.Admin.Counselor;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCounselorByID {
    protected static String url = "https://13.210.163.192:8080";

    @Step("I set GET valid endpoint by ID")
    public String setGetValidEndpointByID() {
        return url + "/admin/counselors";

    }
    @Step("I set GET counselor valid endpoint with invalid ID")
    public String setGetInvalidID() {
        return url + "/admin/counselors";

    }
    @Step("I set GET valid endpoint with empty ID")
    public String setGetEmptyID() {
        return url + "/admin/counselors";

    }

    @Step("I send HTTP GET to the request with valid endpoint")
    public void sendIDReqValidEndpoint() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODczMzA5OTh9.WkAlfX6Vccaw_i6Fp4RIjwdnRH5-0a8P8HIgX5O4WkI";
        SerenityRest
                .given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetValidEndpointByID())
                .pathParams("id", "7993b562-0534-11ee-8266-0242c0a8b003")
                .when()
                .get("/{id}");

    }
    @Step("I receive a HTTP response code 200 OK")
    public void IDHttpResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }


    @Step("I send HTTP GET counselor to request with invalid ID")
    public void sendReqInvalidID() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODczMzA5OTh9.WkAlfX6Vccaw_i6Fp4RIjwdnRH5-0a8P8HIgX5O4WkI";
        SerenityRest
                .given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetInvalidID())
                .pathParams("id", "8993b562-0534-11ee-8266-0242c0a8b003")
                .when()
                .get("/{id}");

    }
    @Step("I receive HTTP response code is 404 Not Found")
    public void IDHttpResponse404() {
        restAssuredThat(response -> response.statusCode(404));

    }


    @Step("I send HTTP GET to request with valid endpoint with empty ID")
    public void sendReqEmptyID() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODczMzA5OTh9.WkAlfX6Vccaw_i6Fp4RIjwdnRH5-0a8P8HIgX5O4WkI";
        SerenityRest
                .given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetEmptyID())
                .pathParams("id", "")
                .when()
                .get("/{id}");

    }
    @Step("I receive a HTTP response code 404")
    public void HttpResponse400() {
        restAssuredThat(response -> response.statusCode(404));

    }

}
