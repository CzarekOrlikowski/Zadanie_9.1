import java.util.Scanner;

public class Memory extends Component implements SpeedUp {
    int size;
    int defaultFrequency;
    int currentFrequency;
    double currentTemperature;
    double maxTemperature;

    public static final double MEMORY_TEMPERATURE_RISE_PER_MHZ = 0.15;

    public Memory(int size, String modelName, String producerName, String serialNumber, int defaultFrequency,
                  double currentTemperature, double maxTemperature) {
        super(modelName, producerName, serialNumber);
        this.size = size;
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

    public double getDefaultTemperature() {
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    @Override
    public void speedUpElement(Computer computer) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj nową czestotliwość pamięci: ");
        int newFrequency = scan.nextInt();

        if (temperatureTest(newFrequency, computer)) {
            computer.getMemory().setCurrentFrequency(newFrequency);
        } else {
            System.out.println("Ryzyko przegrzania pamięci! Częstotlliwość bez zmian!");
        }

    }

    public boolean temperatureTest(int newFrequency, Computer computer) {
        double temperatureRise = computer.getMemory().getCurrentTemperature() +
                MEMORY_TEMPERATURE_RISE_PER_MHZ * (newFrequency - computer.getMemory().getCurrentFrequency());
        if (temperatureRise <= computer.getMemory().getMaxTemperature()) {
            return true;
        } else return false;
    }
}
