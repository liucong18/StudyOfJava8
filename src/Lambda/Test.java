package Lambda;

import java.util.function.IntBinaryOperator;

/**
 * test
 * @author lc
 */
public class Test {
    public static void main(String[] s) {
        /**
         * 定义了一个叫binaryOperator的Lambda表达式，返回值是一个IntBinaryOperator实例。
         */
        IntBinaryOperator binaryOperator = (int a, int b) -> {
            return a + b;
        };
        /**
         * 利用binaryOperator计算
         */
        int result = binaryOperator.applyAsInt(1,2);
        System.out.println(result);
    }
}
