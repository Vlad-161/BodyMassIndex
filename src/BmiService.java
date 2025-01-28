public class BmiService {

    public int calculate (int weight, double height) {
        double result;
        result = weight / ((double) height * height);

        return (int) result;
    }
}
