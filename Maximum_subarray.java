public class Maximum_subarray {
    public static void main(String[] args) {
        int[] given = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = given[0];      // ✅ declared + correct name
        int maxsum = sum;

        for (int i = 1; i < given.length; i++) {
            sum = Math.max(given[i], given[i] + sum);
            maxsum = Math.max(sum, maxsum);
        }

        System.out.println(maxsum); 
    }
}