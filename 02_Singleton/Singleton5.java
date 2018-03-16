/**
 * Created by jkzhao on 3/16/18.
 */

/**
 * 题目：设计一个类，我们只能生成该类的一个实例。
 */
//饿汉式，上来就是new对象。实现按需创建实例
public class Singleton5 {
    private Singleton5(){}

    public static Singleton5 getInstance() {
        return instanceHolder.instance;
    }

    private static class instanceHolder {
        private static Singleton5 instance = new Singleton5();
    }

}
