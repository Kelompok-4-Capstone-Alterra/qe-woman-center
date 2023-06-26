package starter.fitur.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Career {
    protected static String url = "https://13.210.163.192:8080";
    protected static String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3ODY3ODc1fQ.UtrYHk4vNalzLCFK_308Os7K6WXdir2lMSpHfNwWssM";
    @Step("I set get all career information endpoint")
    public String setGetAllCareerEndpoint(){return url + "/users/public/careers";}
    @Step("I send GET Request")
    public void sendGetRequest(){
        SerenityRest.given().relaxedHTTPSValidation()
                .when()
                .get(setGetAllCareerEndpoint());
    }
    @Step("I receives HTTP response code 200")
    public void receivesResCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I set get all career information sort by newest endpoint")
    public String setSortByEnd(){return url + "/users/public/careers?sort_by=newest";}
    @Step("I send GET Request sort by newest")
    public void sortByReq(){
        SerenityRest.given().relaxedHTTPSValidation()
                .when()
                .get(setSortByEnd());
    }
    @Step("I set invalid get all career information endpoint")
    public String setInvEnd(){return url + "/use/public/careers";}
    @Step("I send GET Requests")
    public void sendGetReq(){
        SerenityRest.given().relaxedHTTPSValidation()
                .when()
                .get(setInvEnd());
    }
    @Step("I set get career information by id endpoint")
    public String setGetCareerById(){return url + "/users/public/careers/";}
    @Step("I send Request method GET")
    public void sendReqMethodGet(){
        SerenityRest.given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetCareerById())
                .pathParam("id", "f34cdf7d-11d3-11ee-b2f8-0242c0a8f003")
                .when()
                .get("/{id}");
    }
    @Step("I receives HTTP response code is 200")
    public void codeIs200(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I set invalid get career information by id endpoint")
    public String setInvalidGetCareerEndpoint(){return url + "/use/public/careers/";}
    @Step("I send Request method GET with invalid endpoint")
    public void sendReqWithInvalidEndpoint(){
        SerenityRest.given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setInvalidGetCareerEndpoint())
                .pathParam("id", "f34cdf7d-11d3-11ee-b2f8-0242c0a8f003")
                .when()
                .get("/{id}");
    }
    @Step("I receives HTTP response code is 404")
    public void codeIs404(){restAssuredThat(response -> response.statusCode(404));}
    @Step("I send Request method GET with invalid id")
    public void sendReqInvId(){
        SerenityRest.given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetCareerById())
                .pathParam("id", "f34cdf7d")
                .when()
                .get("/{id}");
    }
    @Step("I receives HTTP response code is 400")
    public void receiveResCode400(){restAssuredThat(response -> response.statusCode(400));}
}