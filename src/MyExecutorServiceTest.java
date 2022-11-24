import java.util.concurrent.*;

public class MyExecutorServiceTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable c1 = new MyCallable(1,100);
        MyCallable c2 = new MyCallable(101, 200);
        MyCallable c3 = new MyCallable(201, 300);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> f1 = executorService.submit(c1);
        Future<Integer> f2 = executorService.submit(c2);
        Future<Integer> f3 = executorService.submit(c3);
        int s1, s2, s3;
        s1 = (int)f1.get();
        s2 = (int)f2.get();
        s3 = (int)f3.get();
        long s = s1 + s2 + s3;
        System.out.println(s);
        executorService.shutdown();
    }
}
