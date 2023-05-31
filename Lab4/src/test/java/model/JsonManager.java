package model;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class JsonManager {
    private static final Gson gson = new Gson();

    public static void writeUniversityToJsonFile(University university, String filePath) {
        String json = gson.toJson(university);

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static University readUniversityFromJsonFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            University university = gson.fromJson(reader, University.class);
            return university;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
