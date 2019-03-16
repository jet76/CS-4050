import java.util.Scanner;
public class SumsToN {
    
    static int n;
    
    public static void main(String [] args)
    {    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        n = s.nextInt();
        s.close();
        for(int i = 1; i <= n; i++) recurse(i, 0, "");
    }
    
    private static void recurse(int num, int sum, String output)
    {
        if(sum > n) return;
        else sum += num;
        if(sum == n)
        {
            System.out.println(output + num);
            return;
        }
        else output += num + " + ";
        for(int i = num; i < n; i++) recurse(i, sum, output);       
    }
    
}