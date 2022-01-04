public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getSudut());

        var tangel = new Rectangle();
        System.out.println(tangel.getSudut());
        System.out.println(tangel.getParntSudut());
    }
}
