class ThreadReceiver implements Runnable {
    private Set_Get m;

    ThreadReceiver(Set_Get m) {
        this.m = m;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Прочитано " + m.take());
        }


    }
}
