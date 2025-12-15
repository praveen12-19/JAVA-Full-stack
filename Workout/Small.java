public class Small {
    public static void main(String[] args) {
        int []a={17,42,5,2,3,64,7,31,8,4,21};
        int min =a[0];
        for(int i =0;i<a.length;i++){
            if(min>a[i]){
                min = a[i];
            }
        }
        System.out.println("Min = " +  min);
    }
}
