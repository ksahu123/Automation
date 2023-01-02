package WebDriver;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssured {
	public static void main(String args[]) {
		//Test Steps
		Response resp = RestAssured.get("https://reqres.in/api/users/2");
		int statuscode = resp.getStatusCode();
		System.out.println(statuscode);
		System.out.println(resp.getTime());
	}

		

}
