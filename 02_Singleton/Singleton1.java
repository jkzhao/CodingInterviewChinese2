/**
 * Created by jkzhao on 3/16/18.
 */

/**
 * 题目：设计一个类，我们只能生成该类的一个实例。
 */
public class Singleton1 {
    private Singleton1(){}

    private static Singleton1 instance = null;
    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
            return instance;
        }
        return instance;
    }

}
