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
            System.out.println(" ");
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
    }
}
