package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {

        float num1 = 0;
        float num2 = 0;
        String operation = "";

        System.out.println("""
                Calculator:
                It can:
                - Add (+)
                - Subtract (-)
                - Multiply (*)
                - Divide (/)
                """);


        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Enter first number:");
                num1 = Float.parseFloat(reader.readLine());
                System.out.println("Enter second number");
                num2 = Float.parseFloat(reader.readLine());
                System.out.println("Enter operation sign:");
                operation = reader.readLine();
                OperationCheckHandler.getInstance().handle(num1, num2, operation);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}