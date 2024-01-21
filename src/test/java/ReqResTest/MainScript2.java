package ReqResTest;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;

public class MainScript2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "https://reqres.in";
		
		Response postUser = given().log().all().header("Content-Type","application/json")
		.body(ReqResInputs.Paylods.PostUserPayload())
		.when().post("api/users").then().assertThat().statusCode(201).extract().response();
		
		String postres = postUser.asString();
		System.out.println(postres);
		
		JsonPath js2=new JsonPath(postres);
		
		String name = js2.getString("name");		
		System.out.println(name);
		String job = js2.getString("job");		
		System.out.println(job);
		String id = js2.getString("id");		
		System.out.println(id);
		String createdAt = js2.getString("createdAt");		
		System.out.println(createdAt);		
		

	}

}
