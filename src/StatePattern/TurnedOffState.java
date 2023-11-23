package StatePattern;

public class TurnedOffState
    extends State{

    TurnedOffState(Phone phone) {
        super(phone);
    }

    @Override
    public void clickOnHomeButton() {
        System.out.println("Transition from 'Turned off' state to 'Locked' state");
        phone.changePhoneState(new LockedState(phone));
    }

    @Override
    public void clickOnLockButton() {
        System.out.println("Transition from 'Turned off' state to 'Locked' state");
        phone.changePhoneState(new LockedState(phone));
    }
}
