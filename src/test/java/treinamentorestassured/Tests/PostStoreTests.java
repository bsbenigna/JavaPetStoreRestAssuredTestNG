package treinamentorestassured.Tests;

import org.testng.annotations.Test;
import treinamentorestassured.jsonObjects.Store;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostStoreTests {

    @Test
    public void cadastrarPedidoPet() {

        Store store = new Store();
        store.setId(99998);
        store.setPetId(99998);
        store.setQuantity(10);
        store.setChipDate("2023-11-15T20:35:05.557Z");
        store.setStatus("placed");
        store.setComplete(true);

        given()
                .baseUri("https://petstore.swagger.io/v2/store/order")
                .log().all()
                .contentType("application/Json")
                .when()
                .body(store)
                .post()
                .then().body("id", equalTo(99998),
                        "petId", equalTo(99998),
                        "quantity", equalTo(10),
                        "status", equalTo("placed"))
                .statusCode(200);
    }
}
