class ThreadReceiver implements Runnable {
    private Set_Get m;

    ThreadReceiver(Set_Get m) {
        this.m = m;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Прочитано " + m.take());
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception");
            }
        }


    }
}
