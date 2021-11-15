package treinamentorestassured.Tests;

import org.testng.annotations.Test;
import treinamentorestassured.jsonObjects.Category;
import treinamentorestassured.jsonObjects.Pet;
import treinamentorestassured.jsonObjects.Tag;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostPetTests {

    @Test
    public void cadastrarNovoPet() {
        Pet pet = new Pet();
        pet.setID(99998);
        Category category = new Category();
        category.setID(99998);
        category.setName("dogs");
        pet.setCategory(category);
        pet.setName("Gaia");
        pet.setPhotoUrls(new String[]{"http://fotosdegato.com.br/foto1.png", "http://fotosdegato.com.br/foto2.png"});

        Tag tag1 = new Tag();
        tag1.setID(99598);
        tag1.setName("Sem raca definida");
        pet.setTags(new Tag[]{tag1});

        pet.setStatus("available");

        given()
                .baseUri("https://petstore.swagger.io/v2/pet")
                .log().all()
                .contentType("application/Json")
                .when()
                .body(pet)
                .post()
                .then().body("id", equalTo(99998),
                        "name", equalTo("Gaia"),
                        "tags[0].name", equalTo("Sem raca definida"),
                        "category.name", equalTo("dogs"))
                .statusCode(200);
    }
}
