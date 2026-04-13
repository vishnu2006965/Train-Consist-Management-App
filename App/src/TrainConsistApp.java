import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize HashSet for Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        System.out.println("\nAdding bogie IDs (including duplicates)...");

        // Step 3: Add Bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        // Step 4: Display Unique Bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIds);

        // Step 5: Program continues
        System.out.println("\nSystem ensured no duplicate bogie IDs exist.");
        System.out.println("System ready for next operations...");
    }
}