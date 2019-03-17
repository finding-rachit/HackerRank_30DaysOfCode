import java.util.*;

public class Day4_ConditionalStatements {



    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = 19;

        scanner.close();

        if (N % 2 != 0)
        {
            System.out.println("Weird");
        }
        else if (N % 2 == 0 )
        {
            if (N >=2 && N <= 5)
            {
                System.out.println("Not Weird");
            }
            else if (N > 20)
            {
                System.out.println("Not Weird");
            }
            else
            {
                System.out.println("Weird");
            }
        }
        else{
            System.out.println("Wrong Choice");
        }
    }
}
