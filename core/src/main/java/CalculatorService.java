public class CalculatorService {
    private final ConsoleService consoleService = new ConsoleService();
    private final BasicOperationsService operationsService = new BasicOperationsService();

    public void runCalculator() {
        while (true) {

            String option = menu();

            switch (option) {
                case "1":
                    performOperation("sum");
                    break;
                case "2":
                    performOperation("subtract");
                    break;
                case "3":
                    performOperation("multiplication");
                    break;
                case "4":
                    performOperation("division");
                    break;
                case "5":
                    return;
                default:
                    consoleService.writeConsole("Invalid option. Please try again.");
            }
        }
    }

    private String menu() {
        consoleService.writeConsole("Select an operation:");
        consoleService.writeConsole("1. Sum");
        consoleService.writeConsole("2. Sub");
        consoleService.writeConsole("3. Mult");
        consoleService.writeConsole("4. Div");
        consoleService.writeConsole("5. Exit");
        consoleService.writeConsole("Option: ");

        return consoleService.readConsole();
    }

    private void performOperation(String operation) {
        double a = readA();
        double b = readB();
        double result;

        switch (operation) {
            case "sum":
                result = operationsService.suma(a, b);
                break;
            case "subtract":
                result = operationsService.resta(a, b);
                break;
            case "multiplication":
                result = operationsService.multiplicacion(a, b);
                break;
            case "division":
                result = operationsService.division(a, b);
                break;
            default:
                consoleService.writeConsole("Invalid operation. Please try again");
                return;
        }

        consoleService.writeConsole("The result of the operation is: " + result);
    }

    private double readA() {
        consoleService.writeConsole("Select number a: ");
        return Double.parseDouble(consoleService.readConsole());
    }

    private double readB() {
        consoleService.writeConsole("Select number b: ");
        return Double.parseDouble(consoleService.readConsole());
    }

}
