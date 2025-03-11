package builderPatter;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Computer computer = Computer.builder()
                .RAM("32 Gb")
                .CPU("intel i7; 3.2 Ghz")
                .Storage("SSD 512")
                .GraphicsCard("NVidia 2GB")
                .build();

        System.out.println(computer);

    }

}
