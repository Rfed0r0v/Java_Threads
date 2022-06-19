class ThreadReceiver_7sec implements Runnable {
    private Set_Get m;

    ThreadReceiver_7sec(Set_Get m) {
        this.m = m;
    }

    @Override
    public void run() {
        while (true) {

            if ((m.take()+1) % 7  == 0) {
                System.out.println(Thread.currentThread() + " received  - " + m.take() + " - Every 7 sec");
            }
        }
    }
}