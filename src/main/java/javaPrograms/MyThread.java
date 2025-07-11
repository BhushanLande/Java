package javaPrograms;

public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Aditya");
        System.out.println("Aditya "+Thread.currentThread().getName());
        System.out.println("Aditya "+Thread.currentThread().getThreadGroup());
        System.out.println("Aditya "+Thread.currentThread().getId());
        System.out.println("Aditya "+Thread.currentThread().getPriority());
        System.out.println("Aditya "+Thread.currentThread().isAlive());
    }
}
