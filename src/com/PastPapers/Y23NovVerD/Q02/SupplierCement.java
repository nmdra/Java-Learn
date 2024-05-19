package PastPapers.Y23NovVerD.Q02;

class SupplierCement extends Thread {
    private final FactorySimulation factory;

    public SupplierCement(FactorySimulation factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
            while (true) {
                try {
                    Thread.sleep(600);
                    synchronized (factory) {
                        factory.addCement();
                        factory.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}
