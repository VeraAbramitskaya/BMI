public class BmiService {
    public int calculate(double hight, int weight) {
        double bmi = weight / (hight * hight);
        int index = (int) bmi;
        return index;
    }
}
