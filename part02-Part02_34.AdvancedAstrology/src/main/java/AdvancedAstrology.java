
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 1;
        while(i <= number) {
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; i++){
            System.out.print(" ");
        }
        
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i = 1; i <= size; i++){
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int j = 0;
        for(int i = 1; i <= height; i++) {
            printSpaces(height-i);
            printStars(i + j);
            j++;
        }
        
        printSpaces(height-2);
        printStars(3);
        System.out.print("");
        printSpaces(height-2);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printTriangle(5);
        System.out.println("---");


        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
