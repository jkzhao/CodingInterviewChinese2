/**
 * Created by jkzhao on 3/16/18.
 */

/**
 * 题目：设计一个类，我们只能生成该类的一个实例。
 */
//饿汉式，上来就是new对象。存在过早创建实例的问题，降低了内存使用效率
public class Singleton4 {
    private Singleton4(){}

    private static Singleton4 instance = new Singleton4();
    public static Singleton4 getInstance() {
        return instance;
    }

}
