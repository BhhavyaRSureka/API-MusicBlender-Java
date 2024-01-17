// Test generated by RoostGPT for test ReatAssured-Test using AI Type Open AI and AI Model gpt-4


// Test generated for /GetCustomerInfo_post for http method type POST in rest-assured framework


// RoostTestHash=88810bf424


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

public class GetCustomerInfoPostTest {
  
    @Test  
    public void GetCustomerInfo_post_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/com/medeiros/RoostTest/GetCustomerInfoPostTest.csv"))) {  
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
					"  \"customerId\": \"" + (map.get("customerId") != null ? map.get("customerId") : "") + "\n" +
 				"}")
				.header("Authorization", "Bearer " + System.getenv("BEARER_TOKEN"))
                .when()
                .post("/GetCustomerInfo")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: successful operation");
    
              if (response.jsonPath().get("alternatePhoneNumber") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("alternatePhoneNumber"), instanceOf(Integer.class));  
          }
    
              if (response.jsonPath().get("customerId") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("customerId"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("email") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("email"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("identificationNumber") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("identificationNumber"), instanceOf(Integer.class));  
          }
    
              if (response.jsonPath().get("identificationType") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("identificationType"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("image") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("image"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("isAlternateMobileNumber") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("isAlternateMobileNumber"), instanceOf(Boolean.class));  
          }
    
              if (response.jsonPath().get("isPrimaryMobileNumber") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("isPrimaryMobileNumber"), instanceOf(Boolean.class));  
          }
    
              if (response.jsonPath().get("location") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("location"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("name") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("name"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("firstName") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("firstName"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("lastName") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("lastName"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("personalBanker") != null) {    
              if (response.jsonPath().get("personalBanker.name") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("personalBanker.name"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("personalBanker.email") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("personalBanker.email"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("personalBanker.mobileNumber") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("personalBanker.mobileNumber"), instanceOf(String.class));  
          }
  
          }
    
              if (response.jsonPath().get("phone") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("phone"), instanceOf(Integer.class));  
          }
    
              if (response.jsonPath().get("securityQuestions") != null) {    
                for (int i = 0; i < response.jsonPath().getList("securityQuestions").size(); i++) {    
                  }  
                MatcherAssert.assertThat(response.jsonPath().getList("securityQuestions"), instanceOf(List.class));
  
          }
    
              if (response.jsonPath().get("segmentId") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("segmentId"), instanceOf(Integer.class));  
          }
    
              if (response.jsonPath().get("userId") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("userId"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("id") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("id"), instanceOf(String.class));  
          }
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
