// ********RoostGPT********
/*
Test generated by RoostGPT for test ReatAssured-Test using AI Type Open AI and AI Model gpt-4

Test generated for /account-access-consents_post for http method type POST in rest-assured framework

RoostTestHash=bc4e821a12


*/

// ********RoostGPT********
package com.medeiros.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class accountaccessconsentsPostTest {
  
    @Test  
    public void accountaccessconsentsPost_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src" + File.separator + "test" + File.separator + "java" + File.separator + "com" + File.separator + "medeiros" + File.separator + "RoostTest" + File.separator + "account-access-consentsPostTest.csv"))) {  
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
                
  
                Response response = given()undefined
                .when()
                .post("/account-access-consents")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 201) {
					System.out.println("Description: Account Access Consents Created");
      
              if (response.jsonPath().get("Data") != null) {      
              if (response.jsonPath().get("Data.ConsentId") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.ConsentId"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.ConsentId").length(), lessThanOrEqualTo(128));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.ConsentId").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.CreationDateTime") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.CreationDateTime"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.Status") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Status"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Status"), anyOf(equalTo("Authorised"), equalTo("AwaitingAuthorisation"), equalTo("Rejected"), equalTo("Revoked")));
  
          }
      
              if (response.jsonPath().get("Data.StatusUpdateDateTime") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.StatusUpdateDateTime"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.Permissions") != null) {      
                for (int i = 0; i < response.jsonPath().getList("Data.Permissions").size(); i++) {      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Data.Permissions"), instanceOf(List.class));
  
          }
      
              if (response.jsonPath().get("Data.ExpirationDateTime") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.ExpirationDateTime"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.TransactionFromDateTime") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.TransactionFromDateTime"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.TransactionToDateTime") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.TransactionToDateTime"), instanceOf(String.class));  
          }
  
          }
      
              if (response.jsonPath().get("Risk") != null) {  
          }
      
              if (response.jsonPath().get("Links") != null) {      
              if (response.jsonPath().get("Links.Self") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Links.Self"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Links.First") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Links.First"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Links.Prev") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Links.Prev"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Links.Next") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Links.Next"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Links.Last") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Links.Last"), instanceOf(String.class));  
          }
  
          }
      
              if (response.jsonPath().get("Meta") != null) {      
              if (response.jsonPath().get("Meta.TotalPages") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Meta.TotalPages"), instanceOf(Integer.class));  
          }
      
              if (response.jsonPath().get("Meta.FirstAvailableDateTime") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Meta.FirstAvailableDateTime"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Meta.LastAvailableDateTime") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Meta.LastAvailableDateTime"), instanceOf(String.class));  
          }
  
          }
				}
if (response.statusCode() == 400) {
					System.out.println("Description: Bad request");
      
              if (response.jsonPath().get("Code") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Code"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Code").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Code").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Id") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Id"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Id").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Id").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Message") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Message"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Message").length(), lessThanOrEqualTo(500));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Message").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Errors") != null) {      
                for (int i = 0; i < response.jsonPath().getList("Errors").size(); i++) {      
              if (response.jsonPath().get("Errors["+ i +"].ErrorCode") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Errors["+ i +"].ErrorCode"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Errors["+ i +"].ErrorCode").length(), lessThanOrEqualTo(128));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Errors["+ i +"].ErrorCode").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Errors["+ i +"].Message") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Errors["+ i +"].Message"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Errors["+ i +"].Message").length(), lessThanOrEqualTo(500));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Errors["+ i +"].Message").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Errors["+ i +"].Path") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Errors["+ i +"].Path"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Errors["+ i +"].Path").length(), lessThanOrEqualTo(500));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Errors["+ i +"].Path").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Errors["+ i +"].Url") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Errors["+ i +"].Url"), instanceOf(String.class));  
          }
      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Errors"), instanceOf(List.class));
  
          }
				}
if (response.statusCode() == 401) {
					System.out.println("Description: Unauthorized");
				}
if (response.statusCode() == 403) {
					System.out.println("Description: Forbidden");
				}
if (response.statusCode() == 404) {
					System.out.println("Description: Not found");
				}
if (response.statusCode() == 405) {
					System.out.println("Description: Method Not Allowed");
				}
if (response.statusCode() == 406) {
					System.out.println("Description: Not Acceptable");
				}
if (response.statusCode() == 415) {
					System.out.println("Description: Unsupported Media Type");
				}
if (response.statusCode() == 429) {
					System.out.println("Description: Too Many Requests");
				}
if (response.statusCode() == 500) {
					System.out.println("Description: Internal Server Error");
      
              if (response.jsonPath().get("Code") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Code"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Code").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Code").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Id") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Id"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Id").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Id").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Message") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Message"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Message").length(), lessThanOrEqualTo(500));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Message").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Errors") != null) {      
                for (int i = 0; i < response.jsonPath().getList("Errors").size(); i++) {      
              if (response.jsonPath().get("Errors["+ i +"].ErrorCode") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Errors["+ i +"].ErrorCode"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Errors["+ i +"].ErrorCode").length(), lessThanOrEqualTo(128));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Errors["+ i +"].ErrorCode").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Errors["+ i +"].Message") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Errors["+ i +"].Message"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Errors["+ i +"].Message").length(), lessThanOrEqualTo(500));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Errors["+ i +"].Message").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Errors["+ i +"].Path") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Errors["+ i +"].Path"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Errors["+ i +"].Path").length(), lessThanOrEqualTo(500));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Errors["+ i +"].Path").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Errors["+ i +"].Url") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Errors["+ i +"].Url"), instanceOf(String.class));  
          }
      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Errors"), instanceOf(List.class));
  
          }
				}
  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}
