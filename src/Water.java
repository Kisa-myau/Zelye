import java.util.NavigableMap;

public class Water extends NatureElement {
    public Water (String name) {
        this.name = name;
    }
    @Override
    public MixedElement connect (NatureElement natureElement){
        MixedElement res = null;
        if (natureElement instanceof Air) {
            res = new Rain();
            System.out.println("Water + Air = " + res);
        } else if (natureElement instanceof Earth) {
            res = new Mud();
            System.out.println("Water + Earth = " + res);
        } else if (natureElement instanceof Water) {
            res = new Sea();
            System.out.println("Water + Water = " + res);
        } else if (natureElement instanceof Fire) {
            res = new Steam();
            System.out.println("Water + Fire = " + res);
        }
        return res;
    }
}
