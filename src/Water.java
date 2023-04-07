import java.util.NavigableMap;

public class Water extends NatureElement {
    @Override
    public MixedElement connect (NatureElement NatureElement){
        Object type = NatureElement.getClass();
        MixedElement mixedElement;
        if (type.equals("Fire")) {
            mixedElement = new Steam();
        } else if (type.equals("Air")) {
            mixedElement = new Rain();
        } else if (type.equals("Earth")) {
            mixedElement = new Mud();
        } else if (type.equals("Water")) {
            mixedElement = new Sea();
        } else {
            mixedElement = null;
            System.out.println("Нет нового элемента");
        }
        return mixedElement;
    }
}
