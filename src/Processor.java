import java.util.Scanner;

public class Processor extends Component implements SpeedUp {
    private int defaultFrequency;
    private int currentFrequency;
    private double currentTemperature;
    private double maxTemperature;

    public static final double PROCESSOR_TEMPERATURE_RISE_PER_MHZ = 0.10;

    public Processor(String modelName, String producerName, String serialNumber, int defaultFrequency,
                     double currentTemperature, double maxTemperature) {
        super(modelName, producerName, serialNumber);
        this.defaultFrequency = defaultFrequency;
        this.currentFrequency = defaultFrequency;
        this.currentTemperature = currentTemperature;
        this.maxTemperature = maxTemperature;
    }

    public int getDefaultFrequency() {
        return defaultFrequency;
    }

    public void setDefaultFrequency(int defaultFrequency) {
        this.defaultFrequency = defaultFrequency;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getCurrentFrequency() {
        return currentFrequency;
    }

    public void setCurrentFrequency(int currentFrequency) {
        this.currentFrequency = currentFrequency;
    }

    @Override
    public void speedUpElement() {
        Scanner scan = new Scanner(System.in);
        int newFrequency;
        double newTemperature;
        boolean conditionCheck;

        do {
            System.out.print("Podaj nową czestotliwość procesora: ");
            newFrequency = scan.nextInt();
            newTemperature = getCurrentTemperature() +
                    PROCESSOR_TEMPERATURE_RISE_PER_MHZ * (newFrequency - getCurrentFrequency());
            conditionCheck = temperatureTest(newTemperature);

            if (conditionCheck) {
                setCurrentFrequency(newFrequency);
                setCurrentTemperature(newTemperature);
            } else {
                System.out.println("Ryzyko przegrzania procesora! Częstotlliwość bez zmian!");
            }

        } while (!conditionCheck);
    }

    public boolean temperatureTest(double newTemperature) {
        if (newTemperature <= getMaxTemperature()) {
            return true;
        } else return false;
    }
}


