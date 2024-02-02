// ********RoostGPT********
/*
Test generated by RoostGPT for test ReatAssured-Test using AI Type Open AI and AI Model gpt-4

Test generated for /api/customer/transactions_get for http method type GET in rest-assured framework

RoostTestHash=c35c7610a4


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

public class transactionsGetTest {

    List<Map<String, String>> envList = new ArrayList<>();


    @Before
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      envList = dataloader.loadData("src/test/java/com/medeiros/RoostTest/transactionsGetTest.csv");
    }

  
    @Test  
    public void transactionsGet_Test() {
        this.setUp();
        for (Map<String, String> map : envList) {
          RestAssured.baseURI = map.get("BASE_URL");  
  
                Response response = given()
				.pathParam("company", map.get("company") != null ? map.get("company") : "")
				.pathParam("from", map.get("from") != null ? map.get("from") : "")
				.pathParam("offset", map.get("offset") != null ? map.get("offset") : "")
				.pathParam("limit", map.get("limit") != null ? map.get("limit") : "")
				.header("Authorization", "Bearer " + map.get("AUTH_TOKEN"))
                .when()
                .get("/api/customer/transactions")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: Get CustomerTransaction");
				}
  
            }  
    }
}
