package Calculator;
public class OperationCheckHandler
    extends Handler{
    private static OperationCheckHandler instance = null;
    protected OperationCheckHandler() {
        super();
    }
    protected OperationCheckHandler(Handler nextHandler) {
        super(nextHandler);
    }
    @Override
    public boolean handle(Number num1, Number num2, String operation){
        System.out.println("Operation handler is called.");
        switch (operation) {
            case "+" -> this.setNextHandler(new AdditionHandler());
            case "-" -> this.setNextHandler(new SubtractionHandler());
            case "*" -> this.setNextHandler(new MultiplicationHandler());
            case "/" -> this.setNextHandler(new DivisionHandler());
            default -> System.out.println("No such operation.");
        }

        return handleNext(num1, num2, operation);
    }
    public static OperationCheckHandler getInstance() {
        if (instance == null) {
            instance = new OperationCheckHandler();
        }
        return instance;
    }
}