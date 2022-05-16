import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min =30,max = 70;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input count elem:");
        int masCount = sc.nextInt();

        int[] mas = new int[masCount];

        //CRUD
        //C-Create
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = random.nextInt(max-min+1)+min;
//        }

        //C-create
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Input current elem#" + i + ": ");
            mas[i] = sc.nextInt();
        }

        //R-retrieve
        System.out.println("Output mas:");
        for (int ma : mas) {
            System.out.println(ma + "");
        }

        System.out.println();

        //U-update
        for (int i = 0; i < mas.length; i++) {
            mas[i] = mas[i]+2;
        }

        //R-retrieve
        System.out.println("Output mas:");
        for (int ma : mas) {
            System.out.println(ma + "");
        }

        //D-DELETE(AS UPDATE)
        mas[1]=-1;

        System.out.println("Output mas:");
        for (int i=0;i<mas.length;i++) {
            if (mas[i]!=-1)
            System.out.println(mas[i] + "");
        }

        //R-retrieve
        System.out.println("Output mas:");
        for (int ma : mas) {
            if(ma%2==0) {
                System.out.println(ma + "");
            }
        }
        System.out.println();

    }
}
