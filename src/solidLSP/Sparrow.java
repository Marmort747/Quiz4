package solidLSP;

public class Sparrow implements Fly, Eat, Action{

    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }


    @Override
    public void execute(Actions action) {
        switch (action) {
            case EAT:
                eat();
            break;
            case FLY:
                fly();
            break;
            default:
                System.out.println("Not supported action");

        }
    }
}
