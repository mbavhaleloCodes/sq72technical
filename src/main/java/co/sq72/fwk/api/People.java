package co.sq72.fwk.api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class People {
    Response starWarsCharacters;
    public Response allAboutPeople(){
        return starWarsCharacters = given()
                .when().log().all()
                .get("/api/people/").prettyPeek();

    }
}
