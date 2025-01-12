import java.util.Scanner;

public class conditions2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        switch (button) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            default:
            break;
        }
        sc.close();
    }
}
