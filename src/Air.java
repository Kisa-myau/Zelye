public class Air extends NatureElement {
    public Air (String name) {
        this.name = name;
    }
    @Override
    public MixedElement connect (NatureElement natureElement) {
        MixedElement res = null;
        if (natureElement instanceof Air) {
            res = new Pressure();
            System.out.println("Air + Air = " + res);
        } else if (natureElement instanceof Earth) {
            res = new Dust();
            System.out.println("Air + Earth = " + res);
        } else if (natureElement instanceof Water) {
            res = new Rain();
            System.out.println("Air + Water = " + res);
        } else if (natureElement instanceof Fire) {
            res = new Energy();
            System.out.println("Air + Fire = " + res);
        }
        return res;
    }
}
