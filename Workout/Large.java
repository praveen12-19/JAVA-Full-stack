public class Large {
    public static void main(String[] args) {
        int[]a={16,74,2,62,44};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max < a[i]){
                max = a[i];
                
            }
           
                                        

        }
        System.out.println("Max = " + max);
    }
}
