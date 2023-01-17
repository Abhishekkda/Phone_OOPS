public class Landline implements Phone{

    private String myPhoneNo;
    private Boolean isRinging;
    private Boolean isPowerOn;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging = false;
        this.isPowerOn = true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public Boolean getRinging() {
        return isRinging;
    }

    public void setRinging(Boolean ringing) {
        isRinging = ringing;
    }

    public Boolean getPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(Boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void callNumber( String phoneNo) {
        if(isPowerOn == true){
            System.out.println("You are dailing the no" +phoneNo);
        }
        else{
            System.out.println("Your Landline is off");
        }
    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPowerOn && myPhoneNo.equals(phoneNo)){
            this.isRinging = true;
            System.out.println("Hey," + myPhoneNo + " You are receiving a call" );
        }
        else{
            System.out.println("Call not received");
        }

    }

    @Override
    public boolean answerCall() {
        if(isRinging == true){
            System.out.println("Call answered");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
