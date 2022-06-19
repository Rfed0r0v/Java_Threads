public class MainClass {
    public static void main(String[] args) {
        Thread arr[] = new Thread[3];
        Set_Get m = new Set_Get();
        arr[0] = new Thread(new ThreadSender(m));
        arr[1] = new Thread(new ThreadReceiver_5sec(m));
        arr[2] = new Thread(new ThreadReceiver_7sec(m));
        for (Thread thread : arr) {
            thread.start();
        }
    }
}
