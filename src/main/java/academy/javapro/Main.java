package academy.javapro;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a new Tesla Model S, 2024
        // TODO: Add your code here
        Tesla tesla = new Tesla("Model S", 2024);

        // Step 2: Display initial status
        System.out.println("Initial Status:");
        // TODO: Display car's initial state
        System.out.println("Tesla " + tesla.getModel() + " " + tesla.getYear());
        System.out.println("Running: " + tesla.getIsRunning());
        System.out.println("Autopilot: " + tesla.isAutopilotEnabled());
        System.out.println("Charging: " + tesla.isCharging());

        // Step 3: Start the car and test basic vehicle functions
        System.out.println("\nTesting basic vehicle functions:");
        // TODO: Start engine
        // TODO: Accelerate
        // TODO: Brake
        tesla.startEngine();
        tesla.accelerate();
        tesla.brake();

        // Step 4: Test autonomous features
        System.out.println("\nTesting autonomous features:");
        // TODO: Enable autopilot
        // TODO: Check if autopilot is enabled
        // TODO: Disable autopilot
        tesla.enableAutopilot();
        System.out.println("Autopilot is currently: " + tesla.isAutopilotEnabled());
        tesla.disableAutopilot();

        // Step 5: Test electric features
        System.out.println("\nTesting electric features:");
        // TODO: Start charging
        // TODO: Check charging status
        tesla.charge();
        System.out.println("Charging status: " + tesla.isCharging());

        // Step 6: Stop the car and display final status
        System.out.println("\nFinal car status:");
        // TODO: Stop engine
        // TODO: Display final state
        tesla.stopEngine();
        System.out.println("Running: " + tesla.getIsRunning());
        System.out.println("Autopilot: " + tesla.isAutopilotEnabled());
        System.out.println("Charging: " + tesla.isCharging());
    }
}
