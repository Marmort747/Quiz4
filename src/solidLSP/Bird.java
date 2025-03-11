package solidLSP;


import static solidLSP.Actions.EAT;
import static solidLSP.Actions.FLY;

public class Bird {

    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow();
        execute(sparrow, EAT);
        execute(sparrow, FLY);

        Penguin penguin = new Penguin();
        execute(penguin, FLY);
        execute(penguin, EAT);

    }

    public static void execute(Action action, Actions actions) {
        action.execute(actions);
    }




}
