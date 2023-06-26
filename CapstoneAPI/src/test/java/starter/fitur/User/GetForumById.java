package starter.fitur.User;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetForumById {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImE1ZmI3OGIwLTExMGMtMTFlZS1hMzkzLTAyNDJjMGE4NDAwMyIsImVtYWlsIjoia2VzYXR1dXNlckBnbWFpbC5jb20iLCJ1c2VybmFtZSI6Imthbmd0ZXN0aW5nIiwiYXV0aF9ieSI6ImF1dGgiLCJleHAiOjE2ODgwNzg1MTJ9.4BV6K1CKom-pSOOmYP8EvvNn8Kdlvne25QTMu8hw7BM";

    public String setGetForumByIdWithValidEndpoint(){
        return url + "/users/forums/3162f68e-f146-4ffc-b936-f4bbc4081428";
    }
    public String setGetForumByIdWithInValidEndpoint(){
        return url + "/user/forums/57745faf-350e-4bb6-b5c4-9920de23f3b0";
    }
    public String setGetForumByIdWithInvalidId(){
        return url + "/users/forums/57745faf-";
    }

    public void sendGetForumByIdWithValidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .get(setGetForumByIdWithValidEndpoint());
    }
    public void receivedGetForumByIdResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    public void sendGetForumByIdWithInvalidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .get(setGetForumByIdWithInValidEndpoint());
    }
    public void receivedGetForumByIdResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    public void sendGetForumByIdWithInvalidId(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .get(setGetForumByIdWithInvalidId());
    }
    public void receivedGetForumByIdResponseCode400(){
        restAssuredThat(response -> response.statusCode(400));
    }

    public void sendGetForumByIdWithoutToken(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .get(setGetForumByIdWithValidEndpoint());
    }
    public void receivedGetForumByIdResponseCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
