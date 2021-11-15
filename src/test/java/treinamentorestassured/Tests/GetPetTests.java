package treinamentorestassured.Tests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetPetTests {
    String URL = "https://petstore.swagger.io/v2";

    @Test
    public void pesquisarPorPetInexistente() {
        given()
                .baseUri(URL)
                .basePath("/pet/{petId}")
                .pathParam("petId", 78745)
                .log().all()
                .when().get()
                .then()
                .statusCode(404);
    }

    @Test
    public void pesquisarPetPorStatus() {
        given()
                .contentType("application/Json")
                .baseUri(URL)
                .basePath("/pet/findByStatus")
                .queryParam("status", "pending")
                .log().all()
                .when()
                .get()
                .then()
                .statusCode(200);

    }

    @Test
    public void realizarRequisiçãoInformandoMetodoInvalido() {
        given()
                .contentType("application/Json")
                .baseUri(URL)
                .basePath("/pet/findByStatus")
                .queryParam("status", "pending")
                .log().all()
                .when()
                .post()
                .then()
                .statusCode(405);
    }
}