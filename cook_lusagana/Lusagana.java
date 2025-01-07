public class Lusagana {
    
    // This method returns the expected time in the oven
    public static int expectedMinutesInOven() {
        return 40;
    }

    // This method calculates how much time is remaining in the oven
    public static int remainingMinutesInOven(int minutesOven) {
        return expectedMinutesInOven() - minutesOven;
    }

    // This method calculates the preparation time based on the number of layers
    public static int preparationTime(int numLayers) {
        return numLayers * 2;
    }

    // This method calculates the total cooking time based on layers and oven time
    public static int totalCookingTime(int numLayers, int minutesOven) {
        return preparationTime(numLayers) + minutesOven;
    }

    // Main method to run the program
    public static void main(String[] args) {
        int numLayers = 3; // Example number of layers
        int minutesOven = 25; // Example time spent in the oven

        // Print results for each function
        System.out.println("Expected minutes in oven: " + expectedMinutesInOven());
        System.out.println("Remaining minutes in oven: " + remainingMinutesInOven(minutesOven));
        System.out.println("Preparation time for " + numLayers + " layers: " + preparationTime(numLayers));
        System.out.println("Total cooking time for " + numLayers + " layers with " + minutesOven + " minutes in the oven: " + totalCookingTime(numLayers, minutesOven));
    }
}
