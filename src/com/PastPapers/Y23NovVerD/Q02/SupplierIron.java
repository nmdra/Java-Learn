package PastPapers.Y23NovVerD.Q02;

class SupplierIron extends Thread {
    private final FactorySimulation factory;

    public SupplierIron(FactorySimulation factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(600);
                synchronized (factory) {
                    factory.addIron();
                    factory.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
