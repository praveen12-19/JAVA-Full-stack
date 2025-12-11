import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int num_1 = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int num_2 = sc.nextInt();

        if(num_1>num_2){
            System.out.println(num_1+" is greater");
        }
        else{
            System.out.println(num_2+ " is Greater");
        }

    }
}
