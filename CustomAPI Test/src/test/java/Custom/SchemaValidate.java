package Custom;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers;
import static io.restassured.matcher.RestAssuredMatchers.matchesXsdInClasspath;
public class SchemaValidate {
	  @Test
	public void validate() throws IOException{
		  File file =new File("./res/add.xml");
	    
	    if(file.exists())
	    	System.out.println(" File in");
	    FileInputStream Obj2=new FileInputStream(file);
	    String requestBody=IOUtils.toString(Obj2,"UTF-8");
	    	baseURI="http://dneonline.com";
	    	given()
	    	.contentType("text/xml")
.accept(ContentType.XML)
	    	.body(requestBody).when().post("/calculator.asmx")
	    	.then().statusCode(200).log().all()
	    	.and()
	    	.assertThat()
	    	.body(matchesXsdInClasspath("cal.xsd"));
}
}