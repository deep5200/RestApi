package restapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Lead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.useRelaxedHTTPSValidation();

		RestAssured.baseURI = "https://ap16.salesforce.com/services/data/v20.0/sobjects/lead";

		RestAssured.authentication = RestAssured.oauth2(
				"00D5g000007oRrU!AQkAQBy5nlmyk84BMqX_6rmCyWL3l6CCHN0LogNoTU2rU0ZQAPaLkFq_Snqn.kunecO1Q7ezXctKtfS4ybl1l08_aKvYg2JN");

		Response response = RestAssured.given().get();

		response.prettyPrint();

	}

}