package builderPatter;

public class Computer {

    private String RAM;
    private String CPU;
    private String Storage;
    private String GraphicsCard;

    public Computer() {

    }

    public Computer(String RAM, String CPU, String storage, String graphicsCard) {
        this.RAM = RAM;
        this.CPU = CPU;
        this.Storage = storage;
        this.GraphicsCard = graphicsCard;
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    public static class ComputerBuilder{

        private String RAM;
        private String CPU;
        private String Storage;
        private String GraphicsCard;

        private ComputerBuilder() {

        }

        public ComputerBuilder RAM(String RAM){
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder CPU(String CPU){
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder Storage(String Storage){
            this.Storage = Storage;
            return this;
        }
        public ComputerBuilder GraphicsCard(String GraphicsCard){
            this.GraphicsCard = GraphicsCard;
            return this;
        }

        public Computer build(){
            return new Computer(this.RAM, this.CPU, this.Storage, this.GraphicsCard);
        }

    }


    @Override
    public String toString() {
        return "Computer{" +
                "RAM='" + RAM + '\'' +
                ", CPU='" + CPU + '\'' +
                ", Storage='" + Storage + '\'' +
                ", GraphicsCard='" + GraphicsCard + '\'' +
                '}';
    }
}
