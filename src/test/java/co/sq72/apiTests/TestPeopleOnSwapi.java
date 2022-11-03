package co.sq72.apiTests;

import co.sq72.fwk.api.People;
import co.sq72.fwk.runner.ApiTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPeopleOnSwapi extends ApiTest {
    People people = new People();
    @Test(testName = "get R2D2 and very skin color")
    public void getR2D2FromPeople(){
        Response starWarsCharacters = people.allAboutPeople();
        Assert.assertEquals(starWarsCharacters.path("results[2].skin_color"),
                "white, blue","Expected skin color is white and blue");
    }
}
