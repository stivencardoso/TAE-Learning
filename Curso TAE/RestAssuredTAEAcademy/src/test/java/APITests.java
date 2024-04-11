import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITests {

    @Test
    void test1(){
        Response response = RestAssured.get("https://63b6dfe11907f863aa04ff81.mockapi.io/api/v1/clients");
        System.out.println("Status code : "+response.asString());
        System.out.println("Response : "+response.getStatusCode());
        System.out.println("Body :"+response.getBody().asString());
        System.out.println("time taken :"+response.getTime());
        System.out.println("Header :"+response.getHeader("content=type"));

        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    void GetClients()
    {
        given().get("https://63b6dfe11907f863aa04ff81.mockapi.io/api/v1/clients").
                then().
                statusCode(200);
    }
    @Test
    void GetClient()
    {
        given().get("https://63b6dfe11907f863aa04ff81.mockapi.io/api/v1/clients/1").
                then().
                statusCode(200);
    }
    @Test
    void Delete(){
        given().delete("https://63b6dfe11907f863aa04ff81.mockapi.io/api/v1/clients/40").
                then().
                statusCode(404);
    }
    @Test
    void Post(){
        RestAssured.baseURI = "https://63b6dfe11907f863aa04ff81.mockapi.io/api/v1/clients";
        String requestBody = "{\"name\": \"mario\", \"lastName\": \"cespedes\",  \"country\": \"colombia\",  \"city\": \"ibague\", \"email\": \"mariocespedes123@gmail.com\", \"phone\": \"300123344\"}";
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestBody) 
                .when()
                .post();
        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 201);
    }
    @Test
    void Patch(){
        RestAssured.baseURI = "https://63b6dfe11907f863aa04ff81.mockapi.io/api/v1/clients/33";
        String requestBody = "{\"name\": \"marios\", \"lastName\": \"cespedes\",  \"country\": \"colombia\",  \"city\": \"ibague\", \"email\": \"mariocespedes123@gmail.com\", \"phone\": \"300123344\"}";
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .patch();
        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 200);
    }

}
