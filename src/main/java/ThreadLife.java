public class ThreadLife {
    public static void main(String [] args){
        MyThread myThread = new MyThread();
        Thread thread  = new Thread(myThread);
        thread.start();

        System.out.println("Bhushan "+Thread.currentThread().getName());
        System.out.println("Bhushan "+Thread.currentThread().getThreadGroup());
        System.out.println("Bhushan "+Thread.currentThread().getId());
        System.out.println("Bhushan "+Thread.currentThread().getPriority());
        System.out.println("Bhushan "+Thread.currentThread().isAlive());
    }

}
