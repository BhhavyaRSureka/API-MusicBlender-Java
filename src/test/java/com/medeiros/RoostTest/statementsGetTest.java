// ********RoostGPT********
/*
Test generated by RoostGPT for test ReatAssured-Test using AI Type Open AI and AI Model gpt-4

Test generated for /statements_get for http method type GET in rest-assured framework

RoostTestHash=80bc4e098f


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

public class statementsGetTest {
  
    @Test  
    public void statementsGet_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src" + File.separator + "test" + File.separator + "java" + File.separator + "com" + File.separator + "medeiros" + File.separator + "RoostTest" + File.separator + "statementsGetTest.csv"))) {  
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
                .get("/statements")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: Statements Read");
      
              if (response.jsonPath().get("Data") != null) {      
              if (response.jsonPath().get("Data.Statement") != null) {      
                for (int i = 0; i < response.jsonPath().getList("Data.Statement").size(); i++) {      
              if (response.jsonPath().get("Data.Statement["+ i +"].AccountId") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].AccountId"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].AccountId").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].AccountId").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementId") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementId"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementId").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementId").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementReference") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementReference"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementReference").length(), lessThanOrEqualTo(35));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementReference").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].Type") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].Type"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].Type"), anyOf(equalTo("AccountClosure"), equalTo("AccountOpening"), equalTo("Annual"), equalTo("Interim"), equalTo("RegularPeriodic")));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StartDateTime") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StartDateTime"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].EndDateTime") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].EndDateTime"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].CreationDateTime") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].CreationDateTime"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementDescription") != null) {      
                for (int i1 = 0; i1 < response.jsonPath().getList("Data.Statement["+ i +"].StatementDescription").size(); i1++) {      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Data.Statement["+ i +"].StatementDescription"), instanceOf(List.class));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementBenefit") != null) {      
                for (int i1 = 0; i1 < response.jsonPath().getList("Data.Statement["+ i +"].StatementBenefit").size(); i1++) {      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementBenefit["+ i1 +"].Type") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementBenefit["+ i1 +"].Type"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementBenefit["+ i1 +"].Type").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementBenefit["+ i1 +"].Type").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementBenefit["+ i1 +"].Amount") != null) {      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementBenefit["+ i1 +"].Amount.Amount") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementBenefit["+ i1 +"].Amount.Amount"), matchesPattern("^\d{1,13}\.\d{1,5}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementBenefit["+ i1 +"].Amount.Amount"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementBenefit["+ i1 +"].Amount.Currency") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementBenefit["+ i1 +"].Amount.Currency"), matchesPattern("^[A-Z]{3,3}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementBenefit["+ i1 +"].Amount.Currency"), instanceOf(String.class));  
          }
  
          }
      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Data.Statement["+ i +"].StatementBenefit"), instanceOf(List.class));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementFee") != null) {      
                for (int i1 = 0; i1 < response.jsonPath().getList("Data.Statement["+ i +"].StatementFee").size(); i1++) {      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementFee["+ i1 +"].CreditDebitIndicator") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementFee["+ i1 +"].CreditDebitIndicator"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementFee["+ i1 +"].CreditDebitIndicator"), anyOf(equalTo("Credit"), equalTo("Debit")));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementFee["+ i1 +"].Type") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementFee["+ i1 +"].Type"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementFee["+ i1 +"].Type").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementFee["+ i1 +"].Type").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementFee["+ i1 +"].Amount") != null) {      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementFee["+ i1 +"].Amount.Amount") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementFee["+ i1 +"].Amount.Amount"), matchesPattern("^\d{1,13}\.\d{1,5}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementFee["+ i1 +"].Amount.Amount"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementFee["+ i1 +"].Amount.Currency") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementFee["+ i1 +"].Amount.Currency"), matchesPattern("^[A-Z]{3,3}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementFee["+ i1 +"].Amount.Currency"), instanceOf(String.class));  
          }
  
          }
      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Data.Statement["+ i +"].StatementFee"), instanceOf(List.class));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementInterest") != null) {      
                for (int i1 = 0; i1 < response.jsonPath().getList("Data.Statement["+ i +"].StatementInterest").size(); i1++) {      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementInterest["+ i1 +"].CreditDebitIndicator") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementInterest["+ i1 +"].CreditDebitIndicator"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementInterest["+ i1 +"].CreditDebitIndicator"), anyOf(equalTo("Credit"), equalTo("Debit")));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementInterest["+ i1 +"].Type") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementInterest["+ i1 +"].Type"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementInterest["+ i1 +"].Type").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementInterest["+ i1 +"].Type").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementInterest["+ i1 +"].Amount") != null) {      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementInterest["+ i1 +"].Amount.Amount") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementInterest["+ i1 +"].Amount.Amount"), matchesPattern("^\d{1,13}\.\d{1,5}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementInterest["+ i1 +"].Amount.Amount"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementInterest["+ i1 +"].Amount.Currency") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementInterest["+ i1 +"].Amount.Currency"), matchesPattern("^[A-Z]{3,3}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementInterest["+ i1 +"].Amount.Currency"), instanceOf(String.class));  
          }
  
          }
      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Data.Statement["+ i +"].StatementInterest"), instanceOf(List.class));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementDateTime") != null) {      
                for (int i1 = 0; i1 < response.jsonPath().getList("Data.Statement["+ i +"].StatementDateTime").size(); i1++) {      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementDateTime["+ i1 +"].DateTime") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementDateTime["+ i1 +"].DateTime"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementDateTime["+ i1 +"].Type") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementDateTime["+ i1 +"].Type"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementDateTime["+ i1 +"].Type").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementDateTime["+ i1 +"].Type").length(), greaterThanOrEqualTo(1));
  
          }
      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Data.Statement["+ i +"].StatementDateTime"), instanceOf(List.class));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementRate") != null) {      
                for (int i1 = 0; i1 < response.jsonPath().getList("Data.Statement["+ i +"].StatementRate").size(); i1++) {      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementRate["+ i1 +"].Rate") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementRate["+ i1 +"].Rate"), matchesPattern("^(-?\d{1,3}){1}(\.\d{1,4}){0,1}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementRate["+ i1 +"].Rate"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementRate["+ i1 +"].Rate").length(), lessThanOrEqualTo(10));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementRate["+ i1 +"].Rate").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementRate["+ i1 +"].Type") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementRate["+ i1 +"].Type"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementRate["+ i1 +"].Type").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementRate["+ i1 +"].Type").length(), greaterThanOrEqualTo(1));
  
          }
      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Data.Statement["+ i +"].StatementRate"), instanceOf(List.class));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementValue") != null) {      
                for (int i1 = 0; i1 < response.jsonPath().getList("Data.Statement["+ i +"].StatementValue").size(); i1++) {      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementValue["+ i1 +"].Value") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementValue["+ i1 +"].Value"), instanceOf(Integer.class));  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementValue["+ i1 +"].Type") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementValue["+ i1 +"].Type"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementValue["+ i1 +"].Type").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementValue["+ i1 +"].Type").length(), greaterThanOrEqualTo(1));
  
          }
      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Data.Statement["+ i +"].StatementValue"), instanceOf(List.class));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementAmount") != null) {      
                for (int i1 = 0; i1 < response.jsonPath().getList("Data.Statement["+ i +"].StatementAmount").size(); i1++) {      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementAmount["+ i1 +"].CreditDebitIndicator") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementAmount["+ i1 +"].CreditDebitIndicator"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementAmount["+ i1 +"].CreditDebitIndicator"), anyOf(equalTo("Credit"), equalTo("Debit")));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementAmount["+ i1 +"].Type") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementAmount["+ i1 +"].Type"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementAmount["+ i1 +"].Type").length(), lessThanOrEqualTo(40));
  
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementAmount["+ i1 +"].Type").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementAmount["+ i1 +"].Amount") != null) {      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementAmount["+ i1 +"].Amount.Amount") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementAmount["+ i1 +"].Amount.Amount"), matchesPattern("^\d{1,13}\.\d{1,5}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementAmount["+ i1 +"].Amount.Amount"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("Data.Statement["+ i +"].StatementAmount["+ i1 +"].Amount.Currency") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("Data.Statement["+ i +"].StatementAmount["+ i1 +"].Amount.Currency"), matchesPattern("^[A-Z]{3,3}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("Data.Statement["+ i +"].StatementAmount["+ i1 +"].Amount.Currency"), instanceOf(String.class));  
          }
  
          }
      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Data.Statement["+ i +"].StatementAmount"), instanceOf(List.class));
  
          }
      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("Data.Statement"), instanceOf(List.class));
  
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
