import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    int a, b;
    public MyCallable(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public Integer call() throws Exception {
        int s = 0;
        for(int i=a; i<b+1; i++){
            Thread.sleep(1);
            s+=i;
        }
        return s;
    }
}
