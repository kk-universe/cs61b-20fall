public class TriangleDrawer {
    public static void drawTriangle(int N) {
       int col = 0;
       int row = 0;
       int SIZE = N + 1;
       while ( row < N) { 
          row += 1;
          while ( col < (SIZE - N)) {
             System.out.print("*");
             col += 1;
          }
          System.out.println(" ");
          N -= 1;
         } 
    
    public static int main(String[] args) {
       drawTriangle(10);
    }
   }
 }