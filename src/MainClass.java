public class MainClass {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape line = new Line();
        
        circle.draw();
        rectangle.draw();
        line.draw();
        
        Shape cF = new FillShapeDecorator(new Circle(), "red");
        Shape rB = new BorderShapeDecorator(new Rectangle(), "green");
        Shape lB = new BorderShapeDecorator(new Line(), "blue");
        
        cF.draw();
        rB.draw();
        lB.draw();
        
        Shape CFB = new BorderShapeDecorator(cF, "blue");
        CFB.draw();
        
    }
}
