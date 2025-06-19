public class Forecast {

    public static double predictFutureValue(double presentValue, double growthRate, int years) {
        // Base case
        if (years == 0) {
            return presentValue;
        }
        // Recursive case
        return predictFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double presentValue = 10000.0;  // Starting amount
        double annualGrowthRate = 0.08; // 8% growth
        int years = 100;

        double futureValue = predictFutureValue(presentValue, annualGrowthRate, years);
        System.out.printf("Predicted Future Value after %d years: ₹%.2f\n", years, futureValue);
    }
}
