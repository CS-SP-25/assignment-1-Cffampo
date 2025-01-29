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
                break;
            case "alaska":
                state = new Alaska();
                break;
            default:
                System.out.println("Invalid state");
                return;
            }

            //set the state name and show the sales tax
        state.setName(stateName);
        state.showTax(value);
        }


    }


