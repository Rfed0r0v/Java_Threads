class ThreadSender implements Runnable {
    int i = 0;
    private Set_Get m;

    ThreadSender(Set_Get m) {
        this.m = m;
    }

    @Override
    public void run() {

        while (true) {
            System.out.println(Thread.currentThread() + " send - " + String.valueOf(i));
            m.put(String.valueOf(i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception");
            }
            i++;
        }
    }
}
