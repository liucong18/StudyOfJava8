package Lambda;

/**
 * @author lc
 */
public class ThreadDemo {
    public static void main(String[] s) {
        /**
         * 不使用Lambda
         */
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("no use lambda");
            }
        });
        /**
         * 使用Lambda,代码要简洁一些
         */
        Thread t2 = new Thread(() -> System.out.println("use lambda"));

        t1.run();
        t2.run();
    }
}
