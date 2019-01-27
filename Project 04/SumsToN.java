public class SumsToN {
    
    private static int n;
    
    public static void main(String [] args)
    {    
        System.out.print("Enter a positive integer: ");
        n = StdIn.readInt();
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