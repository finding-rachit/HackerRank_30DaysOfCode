import java.util.*;

public class Day7_Review {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        int n = Integer.parseInt(first);
        
        for(int i =0; i<n;i++)
        {
            String curr = scan.nextLine();
            int j = 0;
            String even = "";
            String odd = "";

            while (j < curr.length())
            {
                if (j%2 == 0)
                {
                    even += curr.charAt(j);
                }
                else
                {
                    odd += curr.charAt(j);
                }
                j++;
            }
            System.out.print(even + " " + odd + "\n");
        }
        
    }
}

