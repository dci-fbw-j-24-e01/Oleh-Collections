import java.util.*;


public class SortArrays {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] myArray = new int[8];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Next element: ");
            myArray[i] = scanner.nextInt();
        }
        int[] array = sort(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element # " + i + " = " + myArray[i]);
        }
    }

    public static int[] sort(int[] array) {  //boolean
//        int[] myNewArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }
        return array;
    }
}
