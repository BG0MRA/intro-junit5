package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All - called once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each...");

        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Martin"));
    }
    @Test
    void testHelloWorld2() {
        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each...");
    }

    @AfterAll
    public static void AfterAll() {
        System.out.println("After All - called once!!!");
    }
}