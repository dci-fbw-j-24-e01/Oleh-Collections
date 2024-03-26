import java.util.*;


public class ArreyLauncher {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        int[] myArray = new int[8];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Next element: ");
            myArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Element # " + i + " = " + myArray[i] + ", ");
        }
    }
}
