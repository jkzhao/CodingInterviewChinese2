/**
 * Created by jkzhao on 3/16/18.
 */

/**
 * 题目：设计一个类，我们只能生成该类的一个实例。
 */
public class Singleton2 {
    private Singleton2(){}

    //private static Object lock = new Object();

    private static Singleton2 instance = null;
    public static Singleton2 getInstance() {
        synchronized(Singleton2.class) {
            if (instance == null) {
                instance = new Singleton2();
            }
            return instance;
        }
    }

}
