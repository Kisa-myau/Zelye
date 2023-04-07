public class Air extends NatureElement {
    @Override
    public MixedElement connect (NatureElement NatureElement) {
        Object type = NatureElement.getClass();
        MixedElement mixedElement;
        if (type.equals("Fire")) {
            mixedElement = new Energy();
        } else if (type.equals("Air")) {
            mixedElement = new Pressure();
        } else if (type.equals("Earth")) {
            mixedElement = new Dust();
        } else if (type.equals("Water")) {
            mixedElement = new Rain();
        } else {
            mixedElement = null;
            System.out.println("Нет нового элемента");
        }
        return mixedElement;
    }
}
