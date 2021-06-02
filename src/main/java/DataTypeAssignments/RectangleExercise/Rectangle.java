package DataTypeAssignments.RectangleExercise;
public class Rectangle {
    private int height;
    private int width;
    private String color = "No Color";
    public void rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    public void rectangle(int height, int width, String color){
        this.height = height;
        this.width = width;
        this.color = color;
    }
    int calculateSurface(){
        return this.height * this.width;
    }
    int calculateCircumference(){
        return 2 * this.width + 2 * this.height;
    }
    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color = color;
        System.out.println("Color: " + this.color);
    }
    @Override
    public String toString(){
        return String.format("Rectangle 1 has Width: " + this.width + ", Height: " + this.height + ", Color: " + this.color
                          + ", Circumference: " + this.calculateCircumference() + " and Surface: " + this.calculateSurface());
    }
}
