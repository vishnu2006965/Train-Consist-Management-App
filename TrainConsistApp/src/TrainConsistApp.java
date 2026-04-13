import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize HashMap for Bogie-Capacity Mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        System.out.println("\nMapping bogies to their capacities...");

        // Step 3: Insert Key–Value Pairs
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 24);

        // Step 4: Display Capacity Details using entrySet()
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Step 5: Example of Fast Lookup
        System.out.println("\nChecking capacity of 'Sleeper' bogie...");
        int sleeperCapacity = bogieCapacityMap.get("Sleeper");
        System.out.println("Sleeper Capacity: " + sleeperCapacity);

        // Step 6: Program continues
        System.out.println("\nSystem ready for next operations...");
    }
}