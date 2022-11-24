import java.lang.Thread;

public class Adder extends Thread{
    static Integer SHARED_SUB_TOTAL = 0;
    private Integer valueToAdd;
    public Adder(Integer value){
        valueToAdd = value;
    }

    public static Integer getSharedSubTotal() {
        return SHARED_SUB_TOTAL;
    }
    @Override
    public void run(){
        Integer previousTotal = SHARED_SUB_TOTAL;
        try{
            sleep(2);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        Integer newTotal = previousTotal + valueToAdd;
        SHARED_SUB_TOTAL = newTotal;
        System.out.println(this.currentThread().getName()+" : "+SHARED_SUB_TOTAL);
    }
}
