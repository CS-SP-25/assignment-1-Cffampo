package Problem1;

public class FourPointFivePercent implements SalesTaxBehavior {

        // This method computes a 4.5% sales tax for a given value
        public double compute(Double value) {
            return value * 0.045;
        }
}
