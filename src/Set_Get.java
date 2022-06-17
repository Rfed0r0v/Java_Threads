public class Set_Get {
    private String message;

    public synchronized String take() {
        try {
            this.wait();
        } catch (InterruptedException e) {
            System.out.println("Перехвачено исключение");
        }
        String result = this.message;
        this.message = null;
        return result;
    }

    public synchronized void put(String message) {
        this.message = message;
        if (Integer.parseInt(message) % 5 == 0) {
            this.notify();
        }
    }
}
