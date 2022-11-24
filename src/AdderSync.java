import java.lang.Thread;
public class AdderSync extends Thread{
    static int SHARED_SUB_TOTAL = 0;
    private int valueToAdd;
    public AdderSync(int value){
        valueToAdd = value;
    }

    public static int getSharedSubTotal() {
        return SHARED_SUB_TOTAL;
    }
    @Override
    public void run(){
        int newTotal;
        int previousTotal;
        synchronized (AdderSync.class) {
            previousTotal = SHARED_SUB_TOTAL;
            try{
                sleep(2);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            newTotal = previousTotal + valueToAdd;
            SHARED_SUB_TOTAL = newTotal;
        }
        System.out.println(this.currentThread().getName()+" : "+SHARED_SUB_TOTAL);
    }
}
