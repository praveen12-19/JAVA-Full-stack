public class FivePrint {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if(i%5==0){
                System.out.print("5");
            }
            else{
                System.out.print(" " + i + " ");
            }
            
        }
    }
}
