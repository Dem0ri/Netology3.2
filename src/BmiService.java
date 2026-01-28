public class BmiService {

    public int calculate(double weightInKg, double heightInMeters) {
        double bmiIndex = weightInKg / (heightInMeters * heightInMeters);
        return (int) bmiIndex;
    }
}
