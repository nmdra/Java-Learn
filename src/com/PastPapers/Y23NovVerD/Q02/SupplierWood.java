package PastPapers.Y23NovVerD.Q02;

class SupplierWood extends Thread {
    private final FactorySimulation factory;

    public SupplierWood(FactorySimulation factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(600);
                synchronized (factory) {
                    factory.addWood();
                    factory.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
