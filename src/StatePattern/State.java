package StatePattern;

public abstract class State {
    protected Phone phone;

    State() { }
    State(Phone phone) {
        this.phone = phone;
    }

    public abstract void clickOnHomeButton();
    public abstract void clickOnLockButton();
}
