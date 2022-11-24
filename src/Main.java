public class Main {
    public static void main(String[] args) throws InterruptedException {
        AdderSync thread1 = new AdderSync(10);
        AdderSync thread2 = new AdderSync(4);
        System.out.println("Avant : "+AdderSync.SHARED_SUB_TOTAL);
        thread1.start();
        thread2.start();
        Thread.sleep(10);
        System.out.println("Après : "+AdderSync.SHARED_SUB_TOTAL);
    }
}