package lesson3;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arrll = arr.length;
        for (int i = 0; i < arrll; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println(" ");
        for (int i = 0; i < arrll; i++) {
            System.out.println(i + "-" + arr[i]);
        }
        int[] my2arr = new int[100];
        for (int i = 0; i < my2arr.length; i++) {
            my2arr[i] = i + 1;
            System.out.print(" ");
            System.out.print(my2arr[i] + " ");
        }
        System.out.println(" ");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arr3 = array3.length;
        for (int i = 0; i < arr3; i++) {
            if (array3[i] < 6)
                array3[i] = array3[i] * 2;
        }
        System.out.println(" ");

        for (int i = 0; i < arr3; i++) {
            System.out.print(+array3[i] + ", ");
        }
        System.out.println("  ");
        task4();
        System.out.println(" ");
        task5(2, 3);

}
    public static void task4() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void task5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
    }