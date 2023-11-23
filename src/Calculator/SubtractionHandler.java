package Calculator;
public class SubtractionHandler
    extends Handler{
    protected SubtractionHandler() {
        super();
    }
    protected SubtractionHandler(Handler nextHandler) {
        super(nextHandler);
    }
    @Override
    public boolean handle(Number num1, Number num2, String operation) {
        try {
            System.out.println("Subtraction handler is called: " + ((float)num1 - (float)num2));
            return false;
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        return handleNext(num1, num2, operation);
    }
}