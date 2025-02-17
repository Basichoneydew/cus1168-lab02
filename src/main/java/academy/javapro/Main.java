package academy.javapro;

public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla("Model S", 2024);

        System.out.println("Initial Status:");
        System.out.println("Tesla " + tesla.getModel() + " " + tesla.getYear());
        System.out.println("Running: " + tesla.getIsRunning());
        System.out.println("Autopilot: " + tesla.isAutopilotEnabled());
        System.out.println("Charging: " + tesla.isCharging());

        System.out.println("\nTesting basic vehicle functions:");
        tesla.startEngine();
        tesla.accelerate();
        tesla.brake();

        System.out.println("\nTesting autonomous features:");
        tesla.enableAutopilot();
        System.out.println("Autopilot is currently: " + tesla.isAutopilotEnabled());
        tesla.disableAutopilot();

        System.out.println("\nTesting electric features:");
        tesla.charge();
        System.out.println("Charging status: " + tesla.isCharging());

        System.out.println("\nFinal car status:");
        tesla.stopEngine();
        System.out.println("Running: " + tesla.getIsRunning());
        System.out.println("Autopilot: " + tesla.isAutopilotEnabled());
        System.out.println("Charging: " + tesla.isCharging());
    }
}
