public class Earth extends NatureElement {
    @Override
    public MixedElement connect (NatureElement NatureElement) {
        Object type = NatureElement.getClass();
        MixedElement mixedElement;
        if (type.equals("Fire")) {
            mixedElement = new Lava();
        } else if (type.equals("Air")) {
            mixedElement = new Dust();
        } else if (type.equals("Earth")) {
            mixedElement = new Pressure();
        } else if (type.equals("Water")) {
            mixedElement = new Mud();
        } else {
            mixedElement = null;
            System.out.println("Нет нового элемента");
        }
        return mixedElement;
    }
}
