import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
public class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize LinkedList for Train Consist
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("\nAdding bogies to the train...");

        // Step 3: Add Bogies (Order Matters)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist: " + trainConsist);

        // Step 4: Insert Pantry Car at Position 2
        System.out.println("\nInserting Pantry Car at position 2...");
        trainConsist.add(2, "Pantry");

        System.out.println("After Insertion: " + trainConsist);

        // Step 5: Remove First and Last Bogie
        System.out.println("\nRemoving first and last bogie...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Step 6: Display Final Consist
        System.out.println("Final Train Consist: " + trainConsist);

        // Step 7: Program continues
        System.out.println("\nSystem ready for next operations...");
    }
}