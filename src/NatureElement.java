import java.util.NavigableMap;

public abstract class NatureElement {
    protected String name;
    private NatureElement mixedElement;

    protected MixedElement connect (NatureElement NatureElement){return (MixedElement) mixedElement;}
    public static NatureElement create (String name){
        NatureElement result;
        switch (name){
            case  ("Fire"): result = new Fire();break;
            case ("Air"): result = new Air(); break;
            case ("Earth"): result = new Earth(); break;
            case ("Water"): result = new Water (); break;
            default: result = null; System.out.println("Неизвестный элемент"); break;
        }
        return result;
    }
}
