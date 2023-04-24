import java.util.NavigableMap;

public abstract class NatureElement {
    protected String name;
    private NatureElement mixedElement;
    public String getName(){
        return name;
    }

    protected MixedElement connect (NatureElement natureElement){return (MixedElement) mixedElement;}
    public static NatureElement create (String name){
        NatureElement result;
        switch (name){
            case  ("fire"): result = new Fire("fire");break;
            case ("air"): result = new Air("air"); break;
            case ("earth"): result = new Earth("earth"); break;
            case ("water"): result = new Water ("water"); break;
            default: result = null; System.out.println("Неизвестный элемент"); break;
        }
        return result;
    }
}
