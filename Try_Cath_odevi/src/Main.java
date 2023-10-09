import java.util.Arrays;
import java.util.Scanner;


public class Main extends Exception {
    static Scanner scan = new Scanner(System.in);
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static boolean check = true;

    public static void main(String[] args) {

        while (check == true) {

            System.out.println(Arrays.toString(arr));
            System.out.println("Lütfen bir eleman seçiniz : ");
            findArrElm();


        }

    }

    public static void findArrElm() {
        try {
            int index = scan.nextInt();
            System.out.println("Dizideki " + index + ".eleman ==> " + arr[index]);
            check = false;


        } catch (IndexOutOfBoundsException e) {
            System.out.println("Lütfen dizi boyutunun içinde bir eleman giriniz ! ");
            check = true;
        } finally {
            System.out.println();
        }


    }
}