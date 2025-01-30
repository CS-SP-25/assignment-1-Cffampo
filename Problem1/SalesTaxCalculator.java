package Problem1;

public class SalesTaxCalculator {
    public static void main(String[] args) {

        //check if the user has entered the correct number of arguments
        if (args.length != 2){
            System.out.println("Usage: java Problem1.SalesTaxCalculator <state> <value>");
            return;
        }

        //get the state name and value from the user
        String stateName = args[0];
        double value;

        //check if the value entered is a number
        try {
            value = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid value");
            return;
        }

        State state;


        //create a new state object depending on the state name
        switch (stateName.toLowerCase()){
            case "indiana":
                state = new Indiana();
                state.setSalesTaxBehavior(new SevenPercent());
                break;
            case "alaska":
                state = new Alaska();
                state.setSalesTaxBehavior(new NoTax());
                break;
            case "hawaii":
                state = new Hawaii();
                state.setSalesTaxBehavior(new FourPointFivePercent());
                break;
            default:
                System.out.println("Invalid state");
                return;
            }


        state.showTax(value);
        }




    }


