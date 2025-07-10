import java.util.Scanner;
import java.util.concurrent.*;

public class FactorialUsingCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //Taking user input
        Scanner sc = new Scanner(System.in);

        // Create a thread pool with a single thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Number to calculate factorial of
        int number = sc.nextInt();
        // Create a FactorialTask to calculate the factorial of the given number
        Callable<Long> factorialTask = () -> {
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        };

        // Submit the task to the executor
        Future<Long> result = executor.submit(factorialTask);

        // Get the result of the factorial calculation
        System.out.println("Factorial of " + number + " is: " + result.get());

        // Shutdown the executor service
        executor.shutdown();

        System.out.println(Math.random());
    }
}