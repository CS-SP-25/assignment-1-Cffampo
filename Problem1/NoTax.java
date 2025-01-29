package Problem1;

public class NoTax implements SalesTaxBehavior {

    // This method computes a 0% sales tax for a given value
    public double compute(Double value) {
        return 0.00;
    }
}
