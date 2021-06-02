package DataTypeAssignments.RectangleExercise;
public class Main {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        rectangle1.rectangle(3, 10);
        rectangle2.rectangle(5, 6, "Red");
        System.out.println("Surface: " + rectangle1.calculateSurface());
        System.out.println("Surface: " + rectangle2.calculateSurface());
        System.out.println("Circumference: " + rectangle1.calculateCircumference());
        System.out.println("Circumference: " + rectangle2.calculateCircumference());
        System.out.println("Color: " + rectangle1.getColor());
        System.out.println("Color: " + rectangle2.getColor());
        rectangle1.setColor("Blue");
        System.out.println(rectangle1);
        System.out.println(rectangle2);
    }
}
