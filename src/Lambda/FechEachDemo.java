package Lambda;

import java.util.Arrays;
import java.util.List;

/**
 * forEach
 * @author lc
 */
public class FechEachDemo {

    public static void main(String[] s) {
        //外部迭代
        List<String> features1 = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        for (String feature : features1) {
            System.out.println(feature);
        }
        //内部迭代
        List<String> features2 = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features2.stream().forEach(n -> System.out.println(n));
    }
}
