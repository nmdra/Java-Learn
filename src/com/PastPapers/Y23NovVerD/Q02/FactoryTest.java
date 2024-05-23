package PastPapers.Y23NovVerD.Q02;

public class FactoryTest {
    public static void main(String[] args) {
        FactorySimulation factory = new FactorySimulation();

        SupplierIron supplierIron = new SupplierIron(factory);
        SupplierWood supplierWood = new SupplierWood(factory);
        SupplierCement supplierCement = new SupplierCement(factory);
        ProductLine productionLine = new ProductLine(factory);

        supplierIron.start();
        supplierWood.start();
        supplierCement.start();
        productionLine.start();
    }
}
