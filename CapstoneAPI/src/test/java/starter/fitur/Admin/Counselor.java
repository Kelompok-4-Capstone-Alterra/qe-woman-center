package starter.fitur.Admin;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Counselor {
    protected String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc5MjE4MTh9.yjnZ6ThqVUjF-pJ8bmpPRIo6Zw99WN9lkmd5FNvk2Wg";

    @Step("I set GET all counselor with valid endpoint")
    public String setGetAllCounselorWithValidEndpoint() {
        return url + "/admin/counselors";

    }

    @Step("I set GET all counselor with valid endpoint by page")
    public String setGetAllCounselorByPage() {
        return url + "/admin/counselors?page=1";

    }

    @Step("I set GET all counselor with valid endpoint by limit")
    public String setGetAllCounselorByLimit() {
        return url + "/admin/counselors?limit=1";

    }

    @Step("I set GET all counselor with valid endpoint by search")
    public String setGetAllCounselorBySearch() {
        return url + "/admin/counselors?search=test";

    }

    @Step("I set GET all counselor with valid endpoint based sort by")
    public String setGetAllCounselorSortBy() {
        return url + "/admin/counselors?sort_by=newest";

    }

    @Step("I set GET all counselor with valid endpoint by has schedule")
    public String setGetAllCounselorHasSchedule() {
        return url + "/admin/counselors?has_schedule=true";

    }

    @Step("I set GET all counselor with invalid endpoint")
    public String setGetAllCounselorWithInvalidEndpoint() {
        return url + "/admin/counselor";

    }

    @Step("I send HTTP GET request with valid endpoint")
    public void sendReqValidEndpoint() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth().oauth2(token)
                .get(setGetAllCounselorWithValidEndpoint());

    }
    @Step("I receive a valid HTTP response code 200 OK")
    public void HttpResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I send HTTP GET request with valid endpoint by page")
    public void sendReqValidEndpointByPage() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth().oauth2(token)
                .get(setGetAllCounselorByPage());

    }
    @Step("I receive a valid HTTP by page response code 200 OK")
    public void HttpPageResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I send HTTP GET request with valid endpoint by limit")
    public void sendReqValidEndpointByLimit() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth().oauth2(token)
                .get(setGetAllCounselorByLimit());

    }
    @Step("I receive a valid HTTP by limit response code 200 OK")
    public void HttpLimitResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I send HTTP GET request with valid endpoint by search")
    public void sendReqValidEndpointBySearch() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth().oauth2(token)
                .get(setGetAllCounselorBySearch());

    }
    @Step("I receive a valid HTTP by search response code 200 OK")
    public void HttpSearchResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I send HTTP GET request with valid endpoint based sort by")
    public void sendReqValidEndpointSortBy() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth().oauth2(token)
                .get(setGetAllCounselorSortBy());

    }
    @Step("I receive a valid HTTP based sort by response code 200 OK")
    public void HttpSortByResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I send HTTP GET request with valid endpoint by has schedule")
    public void sendReqValidEndpointHasSchedule() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth().oauth2(token)
                .get(setGetAllCounselorHasSchedule());

    }
    @Step("I receive a valid HTTP by has schedule response code 200 OK")
    public void HttpHasScheduleResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }


    @Step("I send HTTP GET request with invalid endpoint")
    public void sendReqInvalidEndpoint() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth().oauth2(token)
                .get(setGetAllCounselorWithInvalidEndpoint());

    }
    @Step("I received HTTP response code 404 Not Found")
    public void HttpResponse404() {
        restAssuredThat(response -> response.statusCode(404));

    }

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
        SerenityRest
                .given().auth().oauth2(token).relaxedHTTPSValidation()
                .baseUri(setGetValidEndpointByID())
                .pathParams("id", "1a99970b-134e-11ee-aaf1-0242ac180003")
                .when()
                .get("/{id}");

    }
    @Step("I receive a HTTP response code 200 OK")
    public void IDHttpResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }


    @Step("I send HTTP GET counselor to request with invalid ID")
    public void sendReqInvalidID() {
         SerenityRest
                .given().auth().oauth2(token).relaxedHTTPSValidation()
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
        SerenityRest
                .given().auth().oauth2(token).relaxedHTTPSValidation()
                .baseUri(setGetEmptyID())
                .pathParams("id", "  ")
                .when()
                .get("/{id}");

    }
    @Step("I receive a HTTP response code 400 Bad Request")
    public void HttpResponse400() {
        restAssuredThat(response -> response.statusCode(400));

    }
}
