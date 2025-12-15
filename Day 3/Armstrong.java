import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dup = num;
        int sum = 0;

        while (dup != 0) {
            int rem=dup%10; // rem =3
            sum = sum +(int)Math.pow(rem,3);
            dup = dup/10;
        }
        if(num == sum){
            System.out.println("Armstrong");
        }
        
    }
}
