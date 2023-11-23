package StatePattern;

public class LockedState
    extends State{

    LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public void clickOnHomeButton() {
        System.out.println("Transition from 'Locked' state to 'Turned on' state");
        phone.changePhoneState(new TurnedOnState(phone));
    }

    @Override
    public void clickOnLockButton() {
        System.out.println("Transition from 'Locked' state to 'Turned on' state");
        phone.changePhoneState(new TurnedOffState(phone));
    }
}
