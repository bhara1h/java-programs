public class SumOfSeries {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += (double) 1 / i * Math.pow(-1, i + 1);
        }
        System.out.println("Sum of the series: " + sum);
    }
}
