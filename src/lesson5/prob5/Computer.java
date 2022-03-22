package lesson5.prob5;

public class Computer {
    String manufacturer;
    String processor;
    int ramSize;
    double processorSpeed;

    Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    int getRamSize() {
        return ramSize;
    }

    double getProcessorSpeed() {
        return processorSpeed;
    }

    double computePower() {
        return ramSize * processorSpeed;
    }


    @Override
    public boolean equals(Object obj) {
        Computer comp = (Computer) obj;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        else return this == obj || manufacturer.equals(comp.manufacturer) && processor.equals(comp.processor) && ramSize == comp.ramSize
                && processorSpeed == comp.processorSpeed;

    }

    @Override
    public String toString() {
        return "Computer Specification: \n" +
                "manufacturer = " + manufacturer + "\n" +
                "processor = " + processor + "\n" +
                "RAM size = " + getRamSize() + "\n" +
                "Processor Speed = " + getProcessorSpeed()+ "\n" +
                "Compute Power = " + computePower();


    }
}
