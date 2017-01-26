import java.util.Scanner;

public class Deliverable1
{
    public static void main(String[] args)
    {
        int userNum = 0;
        int mirrorNum = 0;

        System.out.println("Enter the number to reverse:             ");

        // Captures User Input
        Scanner in = new Scanner(System.in);

        // Captured input is stored in userNum
        userNum = in.nextInt();
        //While Loop: Formula to isolate and display user number, in reverse
        while (userNum != 0)
        {
            mirrorNum = mirrorNum * 10;
            mirrorNum = mirrorNum + userNum %10;
            userNum = userNum/10;
        }

        //System prints out user number in reverse
        System.out.println("Reverse of input number is: " + mirrorNum);

    }
}

