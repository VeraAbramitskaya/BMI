public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double hight = 1.87;
        int weight = 98;
        int index = service.calculate(hight, weight);
        System.out.println("Индекс массы тела: " + index);
    }
}