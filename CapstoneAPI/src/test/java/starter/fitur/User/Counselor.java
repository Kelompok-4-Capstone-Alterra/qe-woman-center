package starter.fitur.User;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Counselor {
    protected static String url = "https://13.210.163.192:8080";
    private String counselorUUID;

    public String setGetCounselorScheduleEndpoint(String uuid) {
        counselorUUID = uuid;
        return url + "/users/counselors/" + uuid + "/schedules";
    }

    public void sendUserGetCounselorScheduleRequest() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .auth().oauth2(Login.userToken)
                .get(setGetCounselorScheduleEndpoint(counselorUUID));
    }

    public void verifyUserGetCounselorScheduleResponseCode(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
}
