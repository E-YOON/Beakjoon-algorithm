import java.util.Scanner;

public class b14489 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        scan.close();

        if(A+B >= C*2)  
            System.out.println((A+B) - C*2);
        else 
            System.out.println(A+B);
    }
}
