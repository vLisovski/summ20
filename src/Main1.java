import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fN;
        String sN;
        int[] firstNum = new int[20];
        int[] secondNum = new int[20];
        int[] answerNum = new int[21];
        int lastDec = 0;
        int memory=0;
        System.out.println("Enter first number:");
        System.out.println("$$$$$$$$$$$$$$$$$$$$");
        fN = scanner.nextLine();
        char[] Fnn = fN.toCharArray();
        for (int i = 0; i < 20; i++) {
            firstNum[i] = Fnn[i] - '0';

        }
        
        System.out.println("Enter second number:");
        System.out.println("$$$$$$$$$$$$$$$$$$$$");
        sN = scanner.nextLine();
        char[] Snn = sN.toCharArray();
        for (int i = 0; i < 20; i++) {
            secondNum[i] = Snn[i] - '0';

        }

        for (int i = firstNum.length - 1; i >= 0; i--) {
            int sum = firstNum[i] + secondNum[i];
            int mod = sum % 10;
            if (sum >= 10) {
                lastDec = 1;
                answerNum[i+1] = mod + memory;
                memory=1;
            } else {
                lastDec = 0;
                answerNum[i+1] = mod + memory;
                memory=0;
            }
        }

        System.out.println("ANSWER:");

        if (lastDec == 0) {
            for (int i = 1; i < answerNum.length; i++) {
                System.out.print(answerNum[i]);
            }
        } else {
            answerNum[0]=1;
            for (int i = 0; i < answerNum.length; i++) {
                System.out.print(answerNum[i]);
            }
        }
    }
}

