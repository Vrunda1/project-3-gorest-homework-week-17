package in.co.gorest.gorestrequests;

import in.co.gorest.model.GoRestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class GoRestUserPatch extends TestBase {
    @Test
    public void UpdateUserRecord() {
        GoRestPojo goRestPojo = new GoRestPojo();
        goRestPojo.setName("Tenali Ramakrishna");
        goRestPojo.setGender("female");
        goRestPojo.setEmail("tenali.ramakrishna1298@gmail.com");
        goRestPojo.setStatus("active");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization","Bearer c426452f777927f6e49219f45652a5fd08178e3f873af217a5b982a6fdd15dac")
                 .when()
                .patch("/users/4212");
        System.out.println("This user is updated");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    }

