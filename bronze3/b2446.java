import java.util.Scanner;

public class b2446 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i-1; j++) {
                System.out.print(" ");
            }

            for(int k=N*2-i; k>=i; k--) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=1; i<=N-1; i++) {
            for(int j=N-1; j>i; j--) {
                System.out.print(" ");
            }

            for(int k=1; k<=(2*i+1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
