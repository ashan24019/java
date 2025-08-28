public class Casting {
    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
        double x = 1.1;
        double y = x + 2;
        System.out.println(y);

        int result = (int)Math.ceil(1.1F);
        System.out.println(result);

        int result_floor = (int)Math.floor(1.1F);
        System.out.println(result_floor);

    }
}
