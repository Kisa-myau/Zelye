public class Fire extends NatureElement {
    public Fire(String name) {
        this.name = name;
    }
    @Override
    public MixedElement connect(NatureElement natureElement) {
        MixedElement res = null;
        if (natureElement instanceof Air) {
            res = new Energy();
            System.out.println("Fire + Air = " + res);
        } else if (natureElement instanceof Earth) {
            res = new Lava();
            System.out.println("Fire + Earth = " + res);
        } else if (natureElement instanceof Water) {
            res = new Steam();
            System.out.println("Fire + Water = " + res);
        } else if (natureElement instanceof Fire) {
            res = null;
            System.out.println("Нет нового элемента: Fire + Fire = null");
        }
        return res;
    }
}
