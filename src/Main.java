import java.security.SecureRandom;


public class Main {

    public static void main(String[] args) {
        int[][] gradesArray = {
                {87, 54, 84},
                {54, 102, 154},
                {14, 22, 552},
                {254, 78, 141},
                {444, 997, 144},
                {14, 5, 366},
                {25, 88, 55},
                {74, 3, 656},
                {252, 77, 788},
                {255, 825, 12}
        };
        System.out.println("Minimal grade " +calcMin(gradesArray));
    }
    private static int calcMin(int[][] grades){
        int min = 100;
        for (int[] row : grades) {
            for (int i : row) {
                if (min > i) {
                    min = i;
                }
            }
        }
        return min;
    }

}

