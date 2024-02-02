// ********RoostGPT********
/*
Test generated by RoostGPT for test ReatAssured-Test using AI Type Open AI and AI Model gpt-4

Test generated for /api/customer/company_get for http method type GET in rest-assured framework

RoostTestHash=eade18684a


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

public class companyGetTest {

    List<Map<String, String>> envList = new ArrayList<>();


    @Before
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      envList = dataloader.loadData("src/test/java/com/medeiros/RoostTest/companyGetTest.csv");
    }

  
    @Test  
    public void companyGet_Test() {
        this.setUp();
        for (Map<String, String> map : envList) {
          RestAssured.baseURI = map.get("BASE_URL");  
  
                Response response = given()
				.queryParam("company", map.get("company") != null ? map.get("company") : "")
				.header("Authorization", "Bearer " + map.get("AUTH_TOKEN"))
                .when()
                .get("/api/customer/company")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: Get All Company Information");
				}
  
            }  
    }
}
