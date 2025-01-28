public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; // метра
        int weight = 98; // кг
        int index = service.calculate(weight, height);

        System.out.println(index);

    }
}
