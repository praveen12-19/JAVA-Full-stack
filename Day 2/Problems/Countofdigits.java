public class Countofdigits {

    public static void main(String[] args) {
        int n=1543;
        int count =0;
        for(int i=n;i>0;i=1/10){
            count++;
        }
    }
}