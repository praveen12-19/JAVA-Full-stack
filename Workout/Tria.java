public class Tria {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {        // rows
            for (int j = 1; j <=(4-i+1); j++) {    // stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
