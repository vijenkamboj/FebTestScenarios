package StartFeb.NewFeb;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class BitCoinRestApiTestFeb {
	RequestSpecification rSpec = RestAssured.given();

	@BeforeClass
	public void Setup() {
		RestAssured.baseURI = "https://api.coindesk.com/v1/bpi/currentprice.json";

	}

	@Test
	public void SendGetRequest() {
		
		  RestAssured.baseURI = "https://api.coindesk.com/v1/bpi/currentprice.json";
		  RequestSpecification rSpec = RestAssured.given();
		 
		Response response = rSpec.request(Method.GET).then().extract().response();
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);

	}

	@Test
	public void GBPDescription() {
		RequestSpecification rSpec = RestAssured.given();
		Response response = rSpec.request(Method.GET).then().extract().response();
		JsonPath jsonpath = response.jsonPath();
		String rs = jsonpath.getString("bpi.GBP.description");
		System.out.println("Value is :" + rs);
		Assert.assertEquals("British Pound Sterling", rs);
	}

	@Test
	public void VerifyResponseForCurrency() {
		RequestSpecification rSpec = RestAssured.given();
		Response response = rSpec.request(Method.GET).then().extract().response();
		JsonPath jsonpath = response.jsonPath();
		String rs2 = jsonpath.getString("bpi");
		System.out.println("Value is :" + rs2);
		Assert.assertEquals(rs2.contains("USD"), true, rs2);
		Assert.assertEquals(rs2.contains("GBP"), true, rs2);
		Assert.assertEquals(rs2.contains("EUR"), true, rs2);
	}

	@Test
	public void BitCoinLogAllInfo() {
		RequestSpecification rSpec = RestAssured.given();
		ValidatableResponse response = rSpec.request(Method.GET).then().extract().response().then().log().all();
		System.out.println("All log informationabout the API test:" + response);
	}

	@Test
	public void BitCoinResponseTime() {
		RequestSpecification rSpec = RestAssured.given();
		long response = rSpec.request(Method.GET).then().extract().response().getTime();
		System.out.println("Response time in ms:" + response);
	}

}
