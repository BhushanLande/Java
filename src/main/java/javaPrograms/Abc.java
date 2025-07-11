package javaPrograms;

public class Abc implements Runnable{
    int sum=0;
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 50; i++) {
                sum += i;
            }
            this.notify();
        }
    }

}
class main{
    public static void main(String [] args) throws InterruptedException,IllegalMonitorStateException {
        Abc a =  new Abc();
        Thread thread = new Thread(a);
        thread.start();

        synchronized (a){
            a.wait();
            System.out.println(a.sum);
        }
    }
}
