public class Computer {
    private Processor processor;
    private Memory memory;
    private Disk disk;

    public Computer(Processor processor, Memory memory, Disk disk) {
        this.processor = processor;
        this.memory = memory;
        this.disk = disk;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public String showInfo() {
        return "\n" +
                "Aktualna konfiguracja komputera: \n" +
                "procesor: " + getProcessor().getModelName() + ", " + getProcessor().getProducerName() + "\n" +
                "częstotliwość: " + getProcessor().getCurrentFrequency() + "\n" +
                "pamięć: " + getMemory().getModelName() + ", " + getMemory().getProducerName() + "\n" +
                "rozmiar: " + getMemory().getSize() + "\n" +
                "częstotliwość: " + getMemory().getCurrentFrequency() + "\n" +
                "dysk: " + getDisk().getModelName() + ", " + getDisk().getProducerName() + "\n" +
                "rozmiar: " + getDisk().getCapacity() + "\n";

    }

}
