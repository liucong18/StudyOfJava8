package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream
 * @author lc
 */
public class StreamDemo {
    public static void main(String[] s) {
        List<Integer> integers = Arrays.asList(4, 5, 6,1, 2, 3,7, 8,8,9,10);
        //过滤出偶数列表 [4,6,8,8,10]
        List<Integer> evens = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        //转成平方列表
        List<Integer> squareList = integers.stream().map(i -> i * i).collect(Collectors.toList());
        //转成平方列表,并行处理
        List<Integer> squareList1 = integers.stream().parallel().map(i -> i * i).collect(Collectors.toList());
    }
}
