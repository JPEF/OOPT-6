public class FillShapeDecorator extends ShapeDecorator {

    private String color;

    public FillShapeDecorator(Shape s, String c) {
        super(s);
        color = c;
    }

    public void draw() {
        shape.draw();
        System.out.println("The shape is filled with " + color);
    }
}
