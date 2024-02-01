// ********RoostGPT********
/*
Test generated by RoostGPT for test ReatAssured-Test using AI Type Open AI and AI Model gpt-4

Test generated for /accounts/{AccountId}/beneficiaries_get for http method type GET in rest-assured framework

RoostTestHash=d927b91e22


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

public class beneficiariesGetTest {
  
    @Test  
    public void beneficiariesGet_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src" + File.separator + "test" + File.separator + "java" + File.separator + "com" + File.separator + "medeiros" + File.separator + "RoostTest" + File.separator + "beneficiariesGetTest.csv"))) {  
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
                .get("/accounts/{AccountId}/beneficiaries")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: Beneficiaries Read");
      
              if (response.jsonPath().get("Data") != null) {      
              if (response.jsonPath().get("Data.Beneficiary") != null) {      
                for (int i = 0; i < response.jsonPath().getList("Data.Beneficiary").size(); i++) {      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].AccountId") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].AccountId"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].AccountId").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].AccountId").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].BeneficiaryId") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].BeneficiaryId"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].BeneficiaryId").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].BeneficiaryId").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].Reference") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].Reference"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].Reference").length(), lessThanOrEqualTo(35));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].Reference").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent") != null) {      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.SchemeName") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.SchemeName"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.SchemeName").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.SchemeName").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.Identification") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.Identification"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.Identification").length(), lessThanOrEqualTo(35));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.Identification").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.Name") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.Name"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.Name").length(), lessThanOrEqualTo(140));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.Name").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress") != null) {      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.AddressType") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.AddressType"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.AddressType"), anyOf(equalTo("Business"), equalTo("Correspondence"), equalTo("DeliveryTo"), equalTo("MailTo"), equalTo("POBox"), equalTo("Postal"), equalTo("Residential"), equalTo("Statement")));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.Department") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.Department"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.Department").length(), lessThanOrEqualTo(70));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.Department").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.SubDepartment") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.SubDepartment"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.SubDepartment").length(), lessThanOrEqualTo(70));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.SubDepartment").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.StreetName") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.StreetName"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.StreetName").length(), lessThanOrEqualTo(70));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.StreetName").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.BuildingNumber") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.BuildingNumber"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.BuildingNumber").length(), lessThanOrEqualTo(16));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.BuildingNumber").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.PostCode") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.PostCode"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.PostCode").length(), lessThanOrEqualTo(16));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.PostCode").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.TownName") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.TownName"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.TownName").length(), lessThanOrEqualTo(35));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.TownName").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.CountrySubDivision") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.CountrySubDivision"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.CountrySubDivision").length(), lessThanOrEqualTo(35));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.CountrySubDivision").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.Country") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.Country"), matchesPattern("^[A-Z]{2,2}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.Country"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.AddressLine") != null) {      
                for (int i1 = 0; i1 < response.jsonPath().getList("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.AddressLine").size(); i1++) {      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Data.Beneficiary["+ i +"].CreditorAgent.PostalAddress.AddressLine"), instanceOf(List.class));
  
          }
  
          }
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAccount") != null) {      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAccount.SchemeName") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAccount.SchemeName"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAccount.SchemeName").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAccount.SchemeName").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAccount.Identification") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAccount.Identification"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAccount.Identification").length(), lessThanOrEqualTo(256));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAccount.Identification").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAccount.Name") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAccount.Name"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAccount.Name").length(), lessThanOrEqualTo(70));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAccount.Name").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAccount.SecondaryIdentification") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Beneficiary["+ i +"].CreditorAccount.SecondaryIdentification"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAccount.SecondaryIdentification").length(), lessThanOrEqualTo(34));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Beneficiary["+ i +"].CreditorAccount.SecondaryIdentification").length(), greaterThanOrEqualTo(1));
  
          }
  
          }
      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Data.Beneficiary"), instanceOf(List.class));
  
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
