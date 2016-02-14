public class BorderShapeDecorator extends ShapeDecorator {

    private String color;

    public BorderShapeDecorator(Shape s, String c) {
        super(s);
        color = c;
    }

    public void draw() {
        shape.draw();
        System.out.println("The shape has a " + color + " border." );
    }


}
