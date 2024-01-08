// Test generated by RoostGPT for test ReatAssured-Test using AI Type Open AI and AI Model gpt-4


// Test generated for /AddRecurringTransfers_post for http method type POST in rest-assured framework


// RoostTestHash=b9ae237532


package com.medeiros.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddRecurringTransfersPostTest {
  
    @Test  
    public void AddRecurringTransfers_post_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/com/medeiros/RoostTest/AddRecurringTransfersPostTest.csv"))) {  
            String headerLine = reader.readLine();  
            String[] headers = headerLine.split(",");  
  
            String line;  
            while ((line = reader.readLine()) != null) {  
                String[] data = line.split(",");  
  
                // Create a map of header to data  
                Map<String, String> map = new HashMap<>();  
                for (int i = 0; i < headers.length; i++) {  
                    map.put(headers[i], data[i]);  
                }  
                
  
                Response response = given()
				.contentType(ContentType.JSON)
				.body("{\n"+
					"  \"customerId\": \"" + (map.get("customerId") != null ? map.get("customerId") : "") + "\",\n" +
					"  \"amount\": \"" + (map.get("amount") != null ? map.get("amount") : "") + "\",\n" +
					"  \"sourceAccountId\": \"" + (map.get("sourceAccountId") != null ? map.get("sourceAccountId") : "") + "\",\n" +
					"  \"targetAccountId\": \"" + (map.get("targetAccountId") != null ? map.get("targetAccountId") : "") + "\",\n" +
					"  \"currency\": \"" + (map.get("currency") != null ? map.get("currency") : "") + "\",\n" +
					"  \"status\": \"" + (map.get("status") != null ? map.get("status") : "") + "\",\n" +
					"  \"scheduledDate\": \"" + (map.get("scheduledDate") != null ? map.get("scheduledDate") : "") + "\",\n" +
					"  \"recurringOptions\": \"" + (map.get("recurringOptions") != null ? map.get("recurringOptions") : "") + "\n" +
 				"}")
				.header("Authorization", "Bearer " + System.getenv("BEARER_TOKEN"))
                .when()
                .post("/AddRecurringTransfers")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: schedule transfer added successfully");
				}
if (response.statusCode() == 401) {
					System.out.println("Description: Error: Authorisation failed.");
    
              if (response.jsonPath().get("err") != null) {    
              if (response.jsonPath().get("err.message") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("err.message"), instanceOf(String.class));  
          }
  
          }
				}
if (response.statusCode() == 404) {
					System.out.println("Description: Error: Not Found");
    
              if (response.jsonPath().get("err") != null) {    
              if (response.jsonPath().get("err.message") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("err.message"), instanceOf(String.class));  
          }
  
          }
				}
  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}
