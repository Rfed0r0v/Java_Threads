public class Set_Get {
    private String message;

    public synchronized String take() {
        while (this.message == null) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println("Перехвачено исключение");
            }
        }
        String result = this.message;
        this.message = null;
        this.notifyAll();
        return result;
    }

    public synchronized void put(String message) {
        while (this.message != null) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println("Перехвачено исключение");
            }
        }
        this.message = message;
        this.notifyAll();
    }
}
