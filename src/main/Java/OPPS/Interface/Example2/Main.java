package OPPS.Interface.Example2;

public class Main {
    public static void main(String [] args){
        Shape square = new Square();
        Shape rectangle = new Square();
        Shape circle = new Circle();

        ShapeDrawer  shapeDrawer = new ShapeDrawer ();

        shapeDrawer.printShape(square);
        shapeDrawer.printShape(rectangle);
        shapeDrawer.printShape(circle);
    }
}
