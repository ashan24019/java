public class ArithmaticExpressions {
    public static void main(String[] args) {
        int addition = 3+8;
        System.out.println(addition);

        int division = 10/3;
        System.out.println(division);
//      division equals to 3

        double division_double = (double) 10 / (double)3;
        System.out.println(division_double);
//      division equals to 3.3333333

        int x = 1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
//      x = 2 and y = 1

        int a = 1;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
//      x = 2 and y = 2
    }
}
