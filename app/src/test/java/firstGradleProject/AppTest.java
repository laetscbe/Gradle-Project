/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package firstGradleProject;

// import static spark.Spark.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class AppTest {
    public String getGreeting() {
        return "Hallo Welt";
    }
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
