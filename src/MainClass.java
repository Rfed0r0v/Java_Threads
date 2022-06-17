public class MainClass {
    public int i;
    public static void main(String[] args) {
        Thread arr[] = new Thread[2];
        Set_Get m = new Set_Get();
        arr[0] = new Thread(new ThreadSender(m));
        arr[0].start();
        arr[1] = new Thread(new ThreadReceiver(m));
        arr[1].start();
    }
}
