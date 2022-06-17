class ThreadReceiver implements Runnable {
    private Set_Get m;

    ThreadReceiver(Set_Get m) {
        this.m = m;
    }

    @Override
    public void run() {
        while (true) {

            if ((m.take()+1) % 5  == 0) {
                System.out.println(Thread.currentThread() + " received  - " + m.take());
            }
        }
    }
}
