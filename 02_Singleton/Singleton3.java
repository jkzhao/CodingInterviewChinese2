/**
 * Created by jkzhao on 3/16/18.
 */

/**
 * 题目：设计一个类，我们只能生成该类的一个实例。
 */
public class Singleton3 {
    private Singleton3(){}

    //private static Object lock = new Object();

    private static Singleton3 instance = null;
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

}
