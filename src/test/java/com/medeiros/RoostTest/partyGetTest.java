// ********RoostGPT********
/*
Test generated by RoostGPT for test ReatAssured-Test using AI Type Open AI and AI Model gpt-4

Test generated for /party_get for http method type GET in rest-assured framework

RoostTestHash=3cc88cc699


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

public class partyGetTest {
  
    @Test  
    public void partyGet_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src" + File.separator + "test" + File.separator + "java" + File.separator + "com" + File.separator + "medeiros" + File.separator + "RoostTest" + File.separator + "partyGetTest.csv"))) {  
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
                .header("Authorization", "Bearer " + System.getenv("BEARER_TOKEN"))
                    .header("x-fapi-financial-id", map.get("x-fapi-financial-id") != null ? map.get("x-fapi-financial-id") : "")
                .when()
                .get("/party")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: Party Read");
      
              if (response.jsonPath().get("Data") != null) {      
              if (response.jsonPath().get("Data.Party") != null) {      
              if (response.jsonPath().get("Data.Party.PartyId") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Party.PartyId"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.PartyId").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.PartyId").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Party.PartyNumber") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Party.PartyNumber"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.PartyNumber").length(), lessThanOrEqualTo(35));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.PartyNumber").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Party.PartyType") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Party.PartyType"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.PartyType"), anyOf(equalTo("Delegate"), equalTo("Joint"), equalTo("Sole")));
  
          }
      
              if (response.jsonPath().get("Data.Party.Name") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Party.Name"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Name").length(), lessThanOrEqualTo(70));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Name").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Party.EmailAddress") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Party.EmailAddress"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.EmailAddress").length(), lessThanOrEqualTo(256));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.EmailAddress").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Party.Phone") != null) {    
                // MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Phone"), matchesPattern("\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Party.Phone"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.Party.Mobile") != null) {    
                // MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Mobile"), matchesPattern("\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Party.Mobile"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.Party.Address") != null) {      
                for (int i = 0; i < response.jsonPath().getList("Data.Party.Address").size(); i++) {      
              if (response.jsonPath().get("Data.Party.Address["+ i +"].AddressType") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Party.Address["+ i +"].AddressType"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Address["+ i +"].AddressType"), anyOf(equalTo("Business"), equalTo("Correspondence"), equalTo("DeliveryTo"), equalTo("MailTo"), equalTo("POBox"), equalTo("Postal"), equalTo("Residential"), equalTo("Statement")));
  
          }
      
              if (response.jsonPath().get("Data.Party.Address["+ i +"].AddressLine") != null) {      
                for (int i1 = 0; i1 < response.jsonPath().getList("Data.Party.Address["+ i +"].AddressLine").size(); i1++) {      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Data.Party.Address["+ i +"].AddressLine"), instanceOf(List.class));
  
          }
      
              if (response.jsonPath().get("Data.Party.Address["+ i +"].StreetName") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Party.Address["+ i +"].StreetName"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Address["+ i +"].StreetName").length(), lessThanOrEqualTo(70));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Address["+ i +"].StreetName").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Party.Address["+ i +"].BuildingNumber") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Party.Address["+ i +"].BuildingNumber"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Address["+ i +"].BuildingNumber").length(), lessThanOrEqualTo(16));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Address["+ i +"].BuildingNumber").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Party.Address["+ i +"].PostCode") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Party.Address["+ i +"].PostCode"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Address["+ i +"].PostCode").length(), lessThanOrEqualTo(16));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Address["+ i +"].PostCode").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Party.Address["+ i +"].TownName") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Party.Address["+ i +"].TownName"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Address["+ i +"].TownName").length(), lessThanOrEqualTo(35));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Address["+ i +"].TownName").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Party.Address["+ i +"].CountrySubDivision") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Party.Address["+ i +"].CountrySubDivision"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Address["+ i +"].CountrySubDivision").length(), lessThanOrEqualTo(35));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Address["+ i +"].CountrySubDivision").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Party.Address["+ i +"].Country") != null) {    
                // MatcherAssert.assertThat(response.jsonPath().getString("Data.Party.Address["+ i +"].Country"), matchesPattern("^[A-Z]{2,2}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Party.Address["+ i +"].Country"), instanceOf(String.class));  
          }
      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Data.Party.Address"), instanceOf(List.class));
  
          }
  
          }
  
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
