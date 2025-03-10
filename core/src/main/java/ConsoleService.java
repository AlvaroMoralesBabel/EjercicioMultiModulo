import java.util.Scanner;

public class ConsoleService {
    private final Scanner scanner = new Scanner(System.in);

    public void writeConsole(String message) {
        System.out.println(message);
    }

    public String readConsole() {
        return scanner.nextLine();
    }
}
