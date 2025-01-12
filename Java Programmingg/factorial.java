import java.util.Scanner;

public class factorial {
    public static void printFactorial(int n)
    {
        int f=1;
        for(int i=n;i>=1;i--)
        {
            f=f*i;
        }

        System.out.println(f);
    }
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        int n= dc.nextInt();
        printFactorial(n);
        dc.close();
    }
}
