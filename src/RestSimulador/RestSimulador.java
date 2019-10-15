package RestSimulador;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestSimulador {

	@Test
	public void ValidarStatus()
	{   
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "todos/1");

		int statusCode = response.getStatusCode();
		assertEquals(statusCode, 200);
				
	}
	
	
	@Test
	public void ValidarHeader()
	{   
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "todos/1");

		 String contentType = response.header("Content-Type");
		 System.out.print (contentType); 
		 assertEquals(contentType, "application/json; charset=utf-8");	 					
	}


@Test
public void ValidarResposta()
{   
	RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
	RequestSpecification httpRequest = RestAssured.given();

	Response response = httpRequest.request(Method.GET, "todos/1");
	
	String responseBody = response.getBody().asString();	
	assertEquals(responseBody, "{\r\n" + 
			"  \"userId\": 1,\r\n" + 
			"  \"id\": 1,\r\n" + 
			"  \"title\": \"delectus aut autem\",\r\n" + 
			"  \"completed\": false\r\n" + 
			"}");
}

@Test
public void TesteNegativoValidarStatus()
{   
	RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
	RequestSpecification httpRequest = RestAssured.given();

	Response response = httpRequest.request(Method.GET, "todos/1");

	int statusCode = response.getStatusCode();
	assertNotSame(statusCode, 400);
			
}


@Test
public void TesteNegativoValidarResposta()
{   
	RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
	RequestSpecification httpRequest = RestAssured.given();

	Response response = httpRequest.request(Method.GET, "todos/1");
	
	String responseBody = response.getBody().asString();	
	assertNotSame(responseBody, "{\r\n" + 
			"  \"userId\": 1,\r\n" + 
			"}");
}



}








