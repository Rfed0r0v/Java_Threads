class ThreadSender implements Runnable {
    private Set_Get m;

    ThreadSender(Set_Get m) {
        this.m = m;
    }

    @Override
    public void run() {
        while (true) {
            m.put(String.valueOf(Math.random()));
        }
    }
}
