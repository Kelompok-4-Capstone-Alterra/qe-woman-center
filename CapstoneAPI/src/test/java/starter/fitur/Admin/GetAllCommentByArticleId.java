package starter.fitur.Admin;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCommentByArticleId {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc5MjExMjN9.emN-gYe3TUSMSvFvLRXFur0tMwwQSeW82SA9sgCs6Ho";

    public String setGetAllCommentByArticleIdWithValidEndpoint(){
        return url + "/admin/articles/d180f788-1343-11ee-a828-0242ac170003/comments";
    }
    public String setGetAllCommentByArticleIdWithInvalidEndpoint(){
        return url + "/admn/articles/5819b9a2-0cd8-11ee-8713-0242ac1d0003/comments";
    }
    public String setGetAllCommentByArticleIdWithInvalidArticleId(){
        return url + "/admin/articles/508bc0b11-068c-11ee-a18f-0242c0a8d00/comments";
    }

    public void sendGetAllCommentByArticleIdWithValidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .get(setGetAllCommentByArticleIdWithValidEndpoint());
    }
    public void receivedGetAllCommentByArticleIdResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    public void sendGetAllCommentByArticleIdWithInvalidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .get(setGetAllCommentByArticleIdWithInvalidEndpoint());
    }
    public void sendGetAllCommentByArticleIdWithInvalidArticleId(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .get(setGetAllCommentByArticleIdWithInvalidArticleId());
    }
    public void sendGetAllCommentByArticleIdWithoutToken(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .get(setGetAllCommentByArticleIdWithValidEndpoint());
    }

    public void receivedGetAllCommentByArticleIdResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
    public void receivedGetAllCommentByArticleIdResponseCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
