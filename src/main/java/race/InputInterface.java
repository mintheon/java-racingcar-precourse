package race;

import java.util.Scanner;

public interface InputInterface {
    Scanner scanner = new Scanner(System.in);

    default String getInput() {
        return scanner.nextLine();
    }
}
