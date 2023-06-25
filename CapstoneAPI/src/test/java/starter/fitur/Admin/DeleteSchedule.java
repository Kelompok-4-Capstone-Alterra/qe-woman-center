package starter.fitur.Admin;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteSchedule {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc5MjExMjN9.emN-gYe3TUSMSvFvLRXFur0tMwwQSeW82SA9sgCs6Ho";

    public String setDeleteScheduleWithValidEndpoint(){
        return url + "/admin/counselors/eac9fc4d-0fe2-11ee-a05a-0242ac170003/schedules";
    }

    public String setDeleteScheduleWithInvalidEndpoint(){
        return url + "/admn/counselors/eac9fc4d-0fe2-11ee-a05a-0242ac170003/schedules";
    }
    public String setDeleteScheduleWithEndpointAndInvalidId(){
        return url + "/admin/counselors/89b50e3f-fb86-11ed-a017-5efc22537c1/schedules";
    }

    public String setDeleteScheduleWithoutToken(){
        return url + "/admin/counselors/eac9fc4d-0fe2-11ee-a05a-0242ac170003/schedules";
    }

    public void sendDeleteScheduleValidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteScheduleWithValidEndpoint());
    }
    public void receivedDeleteResponseCode(){
//        restAssuredThat(response -> response.statusCode(200));
        restAssuredThat(response -> response.statusCode(404));
    }

    public void sendDeleteScheduleWithInvalidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteScheduleWithInvalidEndpoint());
    }

    public void receivedDeleteScheduleResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    public void sendDeleteScheduleWithInvalidEndpointAndInvalidId(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteScheduleWithEndpointAndInvalidId());
    }
    public void receivedDeleteScheduleResponseCode400(){
        restAssuredThat(response -> response.statusCode(400));
    }

    public void sendDeleteScheduleWithoutToken(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .delete(setDeleteScheduleWithoutToken());
    }
    public void receivedDeleteScheduleResponseCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
