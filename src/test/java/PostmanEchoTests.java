import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTests {
    private final String TEXT_BODY = "This is expected to be sent back as part of response body.";

    @BeforeEach
    public void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    public void testGetMethod() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/get?foo1=bar1&foo2=bar2")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void testPostRawTextMethod() {
        given()
                .contentType(ContentType.TEXT)
                .body("{ \"test\": \"value\" }")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .assertThat()
                .body("data", equalTo("{ \"test\": \"value\" }"));
    }

    @Test
    public void testPostFormDataMethod() {
        given()
                .contentType(ContentType.URLENC.withCharset(StandardCharsets.UTF_8))
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .assertThat()
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }

    // Параметризованный тест для PUT, PATCH, DELETE
    @ParameterizedTest
    @MethodSource("httpMethodsProvider")
    public void testHttpMethods(String httpMethod, String endpoint) {
        given()
                .contentType(ContentType.TEXT)
                .body(TEXT_BODY)
                .when()
                .request(httpMethod, endpoint)
                .then()
                .statusCode(200)
                .body("data", equalTo(TEXT_BODY));
    }

    private static Stream<Arguments> httpMethodsProvider() {
        return Stream.of(
                Arguments.of("PUT", "/put"),
                Arguments.of("PATCH", "/patch"),
                Arguments.of("DELETE", "/delete")
        );
    }
}

