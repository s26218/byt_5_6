package Calculator;
public abstract class Handler {
    private Handler nextHandler;
    protected Handler() { }
    protected Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract boolean handle(Number num1, Number num2, String operation);
    protected boolean handleNext(Number num1, Number num2, String operation) {
        if (nextHandler == null) {
            return true;
        }
        return nextHandler.handle(num1, num2, operation);
    }
    public void setNextHandler (Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}