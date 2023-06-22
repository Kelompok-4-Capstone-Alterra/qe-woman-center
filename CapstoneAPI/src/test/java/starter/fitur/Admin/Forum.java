package starter.fitur.Admin;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Forum {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc2NjUxNDR9.nZLq5gyBWjT6HCsbdqs824hie90cR-gnizph_4h_WEg";
    protected static String invalidToken = "eyJh";

    public String setForumEndpoint() {
        return url + "/admin/forums";
    }
    public void sendReq() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setForumEndpoint());
    }
    public void response200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    public String setForumInvEndpoint() {
        return url + "/admn/forums";
    }
    public void sendReqInvEnd() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setForumInvEndpoint());
    }
    public void response404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    public void sendReqInvToken() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(invalidToken).get(setForumEndpoint());
    }
    public void response401() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
