package Lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println("*********************");
        System.out.println(metod1(2, 5));
        System.out.println("*********************");
        System.out.println(metod2(2, 5));
        System.out.println("*********************");
        System.out.println(metod3(2, -5));
        System.out.println("*********************");
        metod4("Самолет", 4);

    }
    private static String metod1(int a, int b) {
        if (a + b >= 10 && a + b <= 20){
            return "True";
        } else {
            return "False";
        }
    }
    private static String metod2(int a, int b) {
        if (a + b >= 0){
            return "Positive";
        } else {
            return "Negative";
        }
    }
    private static String metod3(int a, int b) {
        if (a + b < 0){
            return "True";
        } else {
            return "False";
        }
    }
    private static void metod4(String New, int j) {
        int i = 1;
        while (i <= j){
            i++;
            System.out.println(New + "  ");
    }


}


    }


    