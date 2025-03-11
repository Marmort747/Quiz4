package solidLSP;

public class Penguin implements Eat, Action {

    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }

    @Override
    public void execute(Actions action) {
        switch (action) {
            case EAT:
                eat();
            break;
            default:
                System.out.println("Penguin can not fly");
        }
    }
}
