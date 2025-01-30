package Problem1;

public abstract class State {

    private String name;
    SalesTaxBehavior salesTaxBehavior;

    //getter method
    public String getName() {
        return this.name;
    }

    //setter method
    public void setName(String name) {
        this.name = name;
    }

    public void setSalesTaxBehavior(SalesTaxBehavior salesTaxBehavior) {
        this.salesTaxBehavior = salesTaxBehavior;
    }

    //shows the sales tax depending on the state
    public void showTax(double value){
        System.out.printf("The sales tax on $%.2f in %s is $%.2f\n", value, name, salesTaxBehavior.compute(value));
    }
}
