package co.sq72.fwk.runner;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class ApiTest {
    @BeforeTest
    public void initClient(){
        //RestAssured.given().relaxedHTTPSValidation();
        RestAssured.baseURI = "https://swapi.dev";
    }

}
