// ********RoostGPT********
/*
Test generated by RoostGPT for test ReatAssured-Test using AI Type Open AI and AI Model gpt-4

Test generated for /api/customer/restaurantTableGroup/assignPointOfSale_post for http method type POST in rest-assured framework

RoostTestHash=a92d882cd2


*/

// ********RoostGPT********
package com.medeiros.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class assignPointOfSalePostTest {

    List<Map<String, String>> envList = new ArrayList<>();


    @Before
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      envList = dataloader.loadData("src\test\java\com\medeiros\RoostTest\assignPointOfSalePostTest.csv");
    }

  
    @Test  
    public void assignPointOfSalePost_Test() {
        this.setUp();
        for (Map<String, String> map : envList) {
          RestAssured.baseURI = map.get("BASE_URL");  
  
                Response response = given()
				.pathParam("company", map.get("company") != null ? map.get("company") : "")
				.pathParam("pointOfSaleId", map.get("pointOfSaleId") != null ? map.get("pointOfSaleId") : "")
				.pathParam("tableGroupId", map.get("tableGroupId") != null ? map.get("tableGroupId") : "")
				.header("Authorization", "Bearer " + map.get("AUTH_TOKEN"))
                .when()
                .post("/api/customer/restaurantTableGroup/assignPointOfSale")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: Assign Restaurant Table Group To Point of Sale");
				}
  
            }  
    }
}
