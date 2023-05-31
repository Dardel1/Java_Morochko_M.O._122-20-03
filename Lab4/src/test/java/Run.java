import controller.UniversityController;
import model.University;

public class Run {
    private static final String FILE_PATH = "university.json";
    public static void main(String[] args) {
        University oldUniversity = createTypicalUniversity();
        JsonManager.writeUniversityToJsonFile(oldUniversity, FILE_PATH);
        University newUniversity = JsonManager.readUniversityFromJsonFile(FILE_PATH);
        University university = createTypicalUniversity();
        System.out.println("University Name: " + university.getName());
        System.out.println("Faculty Name: " + university.getFaculty().getName());
        System.out.println("Department Name: " + university.getFaculty().getDepartment().getName());
        System.out.println("Group Name: " + university.getFaculty().getDepartment().getGroup().getName());
        System.out.println("Student Name: " + university.getFaculty().getDepartment().getGroup().getStudent().getName());
        System.out.println("Are universities equal? " + oldUniversity.equals(newUniversity));
    }

    public static University createTypicalUniversity() {
        return UniversityController.createTypicalUniversity();
    }
}
