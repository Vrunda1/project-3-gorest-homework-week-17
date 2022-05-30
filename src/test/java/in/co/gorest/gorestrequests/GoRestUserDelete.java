package in.co.gorest.gorestrequests;

import in.co.gorest.model.GoRestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class GoRestUserDelete extends TestBase {
    @Test
    public void deleteuser(){
        Response response=given()
                .pathParam("id", 10170)
                .when()
                .delete("/users/{id}");
        response.then().statusCode(200);
        System.out.println("Data is delated");
        response.prettyPrint();
    }

    }

