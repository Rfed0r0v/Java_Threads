public class Set_Get {
    private int message;

    public synchronized int take() {
        try {
            this.wait();
        } catch (InterruptedException e) {
            System.out.println("Перехвачено исключение");
        }
        return this.message;
    }

    public synchronized void put(int message) {
        this.message = message;
        notifyAll();
    }
}
