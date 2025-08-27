public class Arrays {
    public static void main(String[] args) {
        int[] numbers = { 8, 3, 4, 5 };
        java.util.Arrays.sort(numbers);
        System.out.println(java.util.Arrays.toString(numbers));

        int[][] multiDemntionalNumbers = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(java.util.Arrays.deepToString(multiDemntionalNumbers));
    }
}
