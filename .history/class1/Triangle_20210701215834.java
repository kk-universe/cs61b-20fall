

public class Triangle {
    public static void main(String[] args) {
        int col = 0;
        int row = 0;
        int SIZE = 5;
        while (row < 5) {
            row += 1;
            col = 0;
            while (col < (6-SIZE)) {
                col += 1;
                System.out.print("*");
            }
            SIZE -= 1;
        }
        

    }
}