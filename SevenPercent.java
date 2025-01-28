public class SevenPercent implements SalesTaxBehavior {

    // This method computes a 7% sales tax for a given value
    public double compute(Double value) {
        return value * 0.07;
    }
}
