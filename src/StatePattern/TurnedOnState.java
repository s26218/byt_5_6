package StatePattern;

public class TurnedOnState
    extends State{

    public TurnedOnState(Phone phone) {
        super(phone);
    }

    @Override
    public void clickOnHomeButton() {
        System.out.println("Returned to home page");
    }

    @Override
    public void clickOnLockButton() {
        System.out.println("Transition from 'Turned on' state to 'Turned off' state");
        phone.changePhoneState(new TurnedOffState(phone));
    }
}
