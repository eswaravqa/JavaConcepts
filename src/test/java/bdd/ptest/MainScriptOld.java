package bdd.ptest;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

//import InputFiles.payload;
import POJO.Location;
import POJO.PostPlaceBody;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.restassured.path.json.JsonPath;

public class MainScriptOld {

	public static void main(String[] args)  {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		PostPlaceBody p=new PostPlaceBody();	
		p.setAccuracy(80);
		p.setAddress("105, Hello Drive, cohen 09");
		p.setLanguage("English-IN");
		p.setWebsite("http://google.com");
		p.setPhone_number("(+91) 983 893 3937");
		p.setName("Good Luck Code Drive");
		List<String> myList =new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		p.setTypes(myList);
		
		Location l = new Location();
		l.setLatitude(-38.383494);
		l.setLongitude(33.427362);
		p.setLocation(l);	
		/*
		 String response = given()
				 	.header("Content-Type", "application/json")
				 	.queryParam("key","qaclick123")
					.body(p)
					.when()
					.post("maps/api/place/add/json")
					.then().log().all().assertThat().statusCode(200)
					.extract().response().asString();
					
		 System.out.println(response);
		 */
			/*		
			Response res = given().log().all().queryParam("key", "qaclick123")
					.body(p)
					.when().post("maps/api/place/add/json")
					.then().assertThat().statusCode(200).extract().response(); 
					
					String responseString=res.asString();
					System.out.println(responseString);
		 
		 
		 */
		 //JsonPath js1 =new JsonPath(addBookResponse);
	
		
	RequestSpecification req =	new RequestSpecBuilder()
			.setBaseUri("https://rahulshettyacademy.com")
			.addQueryParam("key","qaclick123")
			.build();		

	ResponseSpecification resspec = new ResponseSpecBuilder()
			.expectStatusCode(200).build();	
				
			
	RequestSpecification res  = given().spec(req).body(p);	
	
	Response resone = res.when().post("maps/api/place/add/json")
			.then().spec(resspec).extract().response(); 		
	
	String resoneString=resone.asString();
	System.out.println(resoneString);	
			
		
	}

}
