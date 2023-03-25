import java.util.Scanner;

public class FindTopperStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roll, temp, sumOfEvenDigits = 0, sumOfOddDigits = 0;

        System.out.println("Enter roll no:");
        roll = scanner.nextInt();

        while(roll > 0){
            temp = roll % 10;

            if(temp%2 == 0)
                sumOfEvenDigits += temp;
            else sumOfOddDigits += temp;

            roll = roll/10;

        }

        if(sumOfEvenDigits == sumOfOddDigits)
            System.out.println("Yes");
        else System.out.println("No");


    }
}