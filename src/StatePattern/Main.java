package StatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            loop: while(true) {

                System.out.println("""
                        Enter:
                        1 - to click on Home Button
                        2 - to click on Lock Button""");
                int command = Integer.parseInt(reader.readLine());

                switch (command) {
                    case 1 -> phone.getState().clickOnHomeButton();
                    case 2 -> phone.getState().clickOnLockButton();
                    default -> {
                        System.out.println("Unrecognized command");
                        break loop;
                    }
                }

            }
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }

    }
}
