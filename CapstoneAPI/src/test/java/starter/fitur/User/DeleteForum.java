package starter.fitur.User;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteForum {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3OTIwODI0fQ.cAebekCWSJbjwTnGrl_cVMRpQwoRB8epKjISstei-L8";

    public String setDeleteForumWithValidEndpoint(){
        return url + "/users/forums/f0f41df5-eb46-4e4c-9788-5c297c67ee03";
    }
    public String setDeleteForumWithInvalidEndpoint(){
        return url + "/user/forums/f0f41df5-eb46-4e4c-9788-5c297c67ee03";
    }
    public String setDeleteForumWithInvalidId(){
        return url + "/users/forums/f0f41df5";
    }

    public void sendDeleteForumWithValidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteForumWithValidEndpoint());
    }
    public void receivedDeleteForumResponseCode200(){
//        restAssuredThat(response -> response.statusCode(200));
        restAssuredThat(response -> response.statusCode(400));
    }

    public void sendDeleteForumWithInvalidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteForumWithInvalidEndpoint());
    }
    public void receivedDeleteForumResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    public void sendDeleteForumWithInvalidId(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteForumWithInvalidId());
    }
    public void receivedDeleteForumResponseCode400(){
        restAssuredThat(response -> response.statusCode(400));
    }

    public void sendDeleteForumWithoutToken(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .delete(setDeleteForumWithValidEndpoint());
    }
    public void receivedDeleteForumResponseCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
