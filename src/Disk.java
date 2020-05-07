public class Disk extends Component{
    private double capacity;

    public Disk(String modelName, String producerName, String serialNumber, double capacity) {
        super(modelName, producerName, serialNumber);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
