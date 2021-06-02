package IfElseAssignments;
public class Assignment4 {
    public static void main(String[] args) {
        printPyramid(5);
    }

    private static void printPyramid(int size){
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.println("+");
        }
    }
}
