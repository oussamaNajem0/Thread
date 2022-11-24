import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
public class TestCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        MyCallable c1 = new MyCallable(1,200);
        FutureTask<Integer> ft1 = new FutureTask(c1);
        Thread t1 = new Thread(ft1);
        MyCallable c2 = new MyCallable(200,200);
        FutureTask<Integer> ft2 = new FutureTask(c2);
        Thread t2 = new Thread(ft2);
        t1.start();
        t2.start();
        long s1 = (int)ft1.get();
        long s2 = (int)ft2.get();
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
        System.out.println("Resultat : "+(s1+s2));
        System.out.println("FIN");
    }
}
