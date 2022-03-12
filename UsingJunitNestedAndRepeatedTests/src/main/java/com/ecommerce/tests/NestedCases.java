import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
 
@DisplayName("JUnit 5 Nested Example")
@RunWith(JUnitPlatform.class)
public class NestedCases {
 
    @Before
    static void beforeAll() {
        System.out.println("Before all test methods");
    }
 
    @Before
    void beforeEach() {
        System.out.println("Before each test method");
    }
 
    @After
    void afterEach() {
        System.out.println("After each test method");
    }
 
    @After
    static void afterAll() {
        System.out.println("After all test methods");
    }
 
    @Nested
    @DisplayName("Tests for the method A")
    class A {
 
        @Before
        void beforeEach() {
            System.out.println("Before each test method of the A class");
        }
 
        @After
        void afterEach() {
            System.out.println("After each test method of the A class");
        }
 
        @Test
        @DisplayName("Example test for method A")
        void sampleTestForMethodA() {
            System.out.println("Example test for method A");
        }
 
        @Nested
        @DisplayName("When X is true")
        class WhenX {
 
            @BeforeEach
            void beforeEach() {
                System.out.println("Before each test method of the WhenX class");
            }
 
            @AfterEach
            void afterEach() {
                System.out.println("After each test method of the WhenX class");
            }
 
            @Test
            @DisplayName("Example test for method A when X is true")
            void sampleTestForMethodAWhenX() {
                System.out.println("Example test for method A when X is true");
            }
        }
    }
}
