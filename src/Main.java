public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.90; // метра
        int weight = 80; // кг
        int index = service.calculate(weight, height);

        System.out.println(index);

    }
}
