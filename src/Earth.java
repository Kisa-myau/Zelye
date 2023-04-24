public class Earth extends NatureElement {
    public Earth(String name) {
        this.name = name;
    }
    @Override
    public MixedElement connect (NatureElement natureElement) {
            MixedElement res = null;
            if (natureElement instanceof Air) {
                res = new Dust();
                System.out.println("Earth + Air = " + res);
            } else if (natureElement instanceof Earth) {
                res = new Pressure();
                System.out.println("Earth + Earth = " + res);
            } else if (natureElement instanceof Water) {
                res = new Mud();
                System.out.println("Earth + Water = " + res);
            } else if (natureElement instanceof Fire) {
                res = new Lava();
                System.out.println("Earth + Fire = " + res);
            }
            return res;
    }
}
