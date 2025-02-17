package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    public Tesla(String model, int year) {
        super("Tesla", model, year);
        this.autopilotEnabled = false;
        this.charging = false;
    }

    @Override
    public void startEngine() {
        System.out.println("Tesla " + getModel() + " started.");
        setIsRunning(true);
    }

    @Override
    public void stopEngine() {
        System.out.println("Tesla " + getModel() + " is powering down...");
        setIsRunning(false);
    }

    @Override
    public void accelerate() {
        System.out.println("Tesla " + getModel() + " is accelerating!");
    }

    @Override
    public void brake() {
        System.out.println("Tesla " + getModel() + " braking...");
    }

    @Override
    public void charge() {
        System.out.println("Tesla " + getModel() + " is now charging...");
        this.charging = true;
    }

    @Override
    public boolean isCharging() {
        return this.charging;
    }

    @Override
    public void enableAutopilot() {
        System.out.println("Tesla " + getModel() + " autopilot enabled.");
        this.autopilotEnabled = true;
    }

    @Override
    public void disableAutopilot() {
        System.out.println("Tesla " + getModel() + " autopilot disabled.");
        this.autopilotEnabled = false;
    }

    @Override
    public boolean isAutopilotEnabled() {
        return this.autopilotEnabled;
    }
}
