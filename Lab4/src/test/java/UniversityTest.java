import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniversityTest {
    private static final String FILE_PATH = "university.json";

    @Test
    public void testUniversitySerialization() {
        University oldUniversity = Run.createTypicalUniversity();
        JsonManager.writeUniversityToJsonFile(oldUniversity, FILE_PATH);

        University newUniversity = JsonManager.readUniversityFromJsonFile(FILE_PATH);

        Assertions.assertEquals(oldUniversity, newUniversity);
    }
}
