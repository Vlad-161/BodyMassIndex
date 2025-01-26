public class BmiService {

    public int calculate (int weight, double height) {
        double result;
        result = weight / ((double) height * 2);

        return (int) result;
    }
}
