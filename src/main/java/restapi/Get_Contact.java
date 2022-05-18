package restapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Contact {

	public static void main(String[] args) {
		RestAssured.useRelaxedHTTPSValidation();

		RestAssured.baseURI = "https://ap16.salesforce.com/services/data/v20.0/sobjects/Contact";

		RestAssured.authentication = RestAssured.oauth2(
				"00D5g000007oRrU!AQkAQLv76OiZAtwrCPwUlJKiBxWCi7bNowyuNExQtUAbdRqfcMFVs6agcX2D5j5YZYxosGPEnHnX3n.i8aD7AfOcQJ5xVw6w");
		Response response = RestAssured.given().get();

		response.prettyPrint();
	}

}