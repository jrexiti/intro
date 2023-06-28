package Section07;

public class L21_Threads {

    public static void main(String[] args) {

        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        ThreadOverride thread2 = new ThreadOverride();

        System.out.println("----------");

        System.out.println(thread2.isAlive());
        thread2.start();
        System.out.println(thread2.isAlive());
        System.out.println(thread2.getName());

    }

}
