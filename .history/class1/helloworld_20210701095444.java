public class helloworld {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        while (x < 10) {
            System.out.println(x + " ");
            System.out.println(sum);
            sum += x;
            x = x + 1;
        }
    }
}
