/**
 * Created by jkzhao on 3/16/18.
 */
public class Test {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + "==========" + Singleton5.getInstance());
                    try{
                        Thread.sleep((int)(Math.random() * 1000));
                    }catch(InterruptedException e){

                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + "==========" + Singleton5.getInstance());
                    try{
                        Thread.sleep((int)(Math.random() * 1000));
                    }catch(InterruptedException e){

                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + "==========" + Singleton5.getInstance());
                    try{
                        Thread.sleep((int)(Math.random() * 1000));
                    }catch(InterruptedException e){

                    }
                }
            }
        }).start();
    }
}
