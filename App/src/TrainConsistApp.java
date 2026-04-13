import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize LinkedHashSet for Train Formation
        Set<String> trainFormation = new LinkedHashSet<>();

        System.out.println("\nAttaching bogies to the train...");

        // Step 3: Add Bogies (Insertion Order Maintained)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 4: Attempt to Add Duplicate
        System.out.println("\nAttempting to add duplicate 'Sleeper' bogie...");
        trainFormation.add("Sleeper"); // Duplicate (ignored)

        // Step 5: Display Final Formation
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        System.out.println(trainFormation);

        // Step 6: Program continues
        System.out.println("\nSystem ensured ordered and duplicate-free consist.");
        System.out.println("System ready for next operations...");
    }
}