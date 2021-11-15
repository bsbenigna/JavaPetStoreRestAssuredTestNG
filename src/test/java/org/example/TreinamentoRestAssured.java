package org.example;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TreinamentoRestAssured {
    @Test
    public void pesquisarPorPetInexistente(){
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/{petId}")
                .pathParam("petId",99998)
                .log().all()
                .when()
                .get()
                .then()
                .statusCode(404);
    }
}
