package Custom;


import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test1 {
	  @Test
	public void testDELETE() {
	    
	    	baseURI="https://reqres.in/api";

	    	when()
	    	.delete("/users/2")
	    	.then()
	    	.statusCode(204).log().all();
	    }
}
