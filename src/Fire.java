public class Fire extends NatureElement {
    @Override
    public MixedElement connect (NatureElement NatureElement) {
        //Object type = NatureElement.getClass();
        MixedElement mixedElement;
        if (NatureElement.getClass().equals("Fire")) {
            mixedElement = null;
        } else if (NatureElement.getClass().equals("Air")) {
            mixedElement = new Energy();
        } else if (NatureElement.getClass().equals("Earth")) {
            mixedElement = new Lava();
        } else if (NatureElement.getClass().equals("Water")) {
            mixedElement = new Steam();
        } else {
            mixedElement = null;
            System.out.println("Нет нового элемента");
        }
        return mixedElement;
    }
}
