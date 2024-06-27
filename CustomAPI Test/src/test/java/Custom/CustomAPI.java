package Custom;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CustomAPI {
	  @Test
	public void get() {
	    
	    	baseURI="http://localhost:3000";
	    	given()
	    	.get("/users")
	    	.then()
	    	.statusCode(200).log().all();
	    }
//	  @Test
//		public void post() {
//		    JSONObject obj =new JSONObject();
//		    obj.put("firstsName", "Hahsara");
//		    obj.put("lastName", "Neth");
//		    obj.put("subjectId", 1);
//		    
//		    	baseURI="http://localhost:3000";
//		    	given()
//		    	.contentType(ContentType.JSON)
//		    	.accept(ContentType.JSON)
//		    	.body(obj.toJSONString())
//		    	.when()
//		    	.post("/users")
//		    	.then()
//		    	.statusCode(201).log().all();
//		    }
//	  @Test
//			public void put() {
//			    JSONObject obj =new JSONObject();
//			    obj.put("firstsName", "ravin");
//			    obj.put("lastName", "Colos");
//			    obj.put("subjectId", 2);
//			    
//			    	baseURI="http://localhost:3000";
//			    	given()
//			    	.contentType(ContentType.JSON)
//			    	.accept(ContentType.JSON)
//			    	.body(obj.toJSONString())
//			    	.when()
//			    	.put("/users/4")
//			    	.then()
//			    	.statusCode(200);
//			    }
	  @Test
			public void patch() {
			    JSONObject obj =new JSONObject();
			    
			    obj.put("lastName", "don");
			   
			    
			    	baseURI="http://localhost:3000";
			    	given()
			    	.contentType(ContentType.JSON)
			    	.accept(ContentType.JSON)
			    	.body(obj.toJSONString())
			    	.when()
			    	.patch("/users/4")
			    	.then()
			    	.statusCode(200);
			    }
	  @Test
		public void delete() {

		baseURI="http://localhost:3000";
		    	
		    	when()
		    	.delete("/users/4")
		    	.then()
		    	.statusCode(200);
		    }
}
