public class ComputerTest {
    public static void main(String[] args) {

        Disk disk = new Disk ("Alfa", "WD", "123nb", 2000.0);
        Memory memory = new Memory(2000, "Beta", "Kingstone", "34efr4",
                3000, 70.0, 100.0);
        Processor processor = new Processor("R342", "Intel", "fr43",
                3000, 70.0, 100.0);

        Computer computer = new Computer(processor, memory, disk);
        System.out.println(computer.showInfo());

        processor.speedUpElement();
        memory.speedUpElement();
        System.out.println(computer.showInfo());
    }
}
