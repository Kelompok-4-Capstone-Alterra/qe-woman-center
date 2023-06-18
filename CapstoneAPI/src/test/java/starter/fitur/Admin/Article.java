package starter.fitur.Admin;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Article {
    protected static String url = "https://13.210.163.192:8080";
    private String articleUUID;

    public String setDeleteAdminArticleEndpoint(String uuid) {
        articleUUID = uuid;
        return url + "/admin/articles/" + uuid;
    }

    public void sendDeleteAdminArticleRequest() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .auth().oauth2(Login.adminToken)
                .delete(setDeleteAdminArticleEndpoint(articleUUID));
    }

    public void verifyDeleteAdminArticleResponseCode(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
}
