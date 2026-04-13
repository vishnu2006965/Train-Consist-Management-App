import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize Passenger Bogie List
        List<String> passengerBogies = new ArrayList<>();

        System.out.println("\nAdding passenger bogies...");

        // Step 3: Add Bogies (CREATE)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 4: Display Bogies (READ)
        System.out.println("Passenger Bogies: " + passengerBogies);

        // Step 5: Remove a Bogie (DELETE)
        System.out.println("\nRemoving 'AC Chair' bogie...");
        passengerBogies.remove("AC Chair");

        // Step 6: Display After Removal
        System.out.println("Passenger Bogies after removal: " + passengerBogies);

        // Step 7: Check Existence (SEARCH)
        System.out.println("\nChecking if 'Sleeper' exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        // Step 8: Final State
        System.out.println("\nFinal Passenger Bogie List: " + passengerBogies);

        // Step 9: Program continues
        System.out.println("\nSystem ready for next operations...");
    }
}