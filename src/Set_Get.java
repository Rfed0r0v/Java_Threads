public class Set_Get {
    private int message;

    public synchronized int take() {
        try {
            this.wait();
        } catch (InterruptedException e) {
            System.out.println("Перехвачено исключение");
        }
        int result = this.message;
        this.message = 0;
        return result;
    }

    public synchronized void put(int message) {
        this.message = message;
        if (message % 5 == 0) {
            this.notify();
        }
    }
}
