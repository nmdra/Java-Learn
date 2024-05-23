package PastPapers.Y23NovVerD.Q02;

class ProductLine extends Thread {
    private final FactorySimulation factory;

    public ProductLine(FactorySimulation factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    synchronized (factory) {
                        factory.produceProduct();
                        factory.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
