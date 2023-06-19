package starter.fitur.User;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Article {
    protected static String url = "https://13.210.163.192:8080";
    private String articleUUID;

    // read article
    public String setUserGetArticleEndpoint(String uuid) {
        articleUUID = uuid;
        return url + "/users/articles/" + uuid;
    }

    public void sendUserGetArticleRequest() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .auth().oauth2(Login.userToken)
                .get(setUserGetArticleEndpoint(articleUUID));
    }

    public void verifyUserArticleResponseCode(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
}
