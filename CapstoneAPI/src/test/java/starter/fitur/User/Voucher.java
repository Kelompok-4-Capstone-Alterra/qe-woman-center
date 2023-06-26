package starter.fitur.User;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Voucher {
    protected static String url = "https://13.210.163.192:8080";
    private static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImZkMzY4ZDNkLTBmZmYtMTFlZS1hNGYxLTAyNDJhYzE4MDAwMyIsImVtYWlsIjoicmluaXR1YjAxQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoicmluaSIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3OTIyMTc3fQ.hWf_8FimTl4ECgSqpUaL4YMqetYxWj_2QSOIkwZr4fU";
    protected static String invalidToken = "eyJh";

    public String setVoucherEndpoint() {
        return url + "/users/vouchers";
    }
    public String setInvalidEndpoint() {
        return url + "/urs/vouchers";
    }
    public void sendReq() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setVoucherEndpoint());
    }
    public void sendReqInvToken() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(invalidToken).get(setVoucherEndpoint());
    }
    public void sendReqInvEnd() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setInvalidEndpoint());
    }
    public void successViewAllVoucher() {
        restAssuredThat(response -> response.statusCode(200));
    }
    public void failViewAllVoucher401() {
        restAssuredThat(response -> response.statusCode(401));
    }
    public void failViewAllVoucher404() {
        restAssuredThat(response -> response.statusCode(404));
        restAssuredThat(response -> response.body("message", equalTo("Not Found")));
    }
}
