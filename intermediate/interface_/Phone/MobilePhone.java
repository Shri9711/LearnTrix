package interface_.Phone;

public class MobilePhone implements ITelephone {
	int myNumber;
	boolean isRinging;
	boolean isOn;
	
	public MobilePhone(int myNumber) {
		this.myNumber = myNumber;
	}
	
	@Override
	public void poweron() {
		isOn = true;
		System.out.println("Powering on the device");
		
	}
	
	@Override
	public void dial(int phoneNumber) {
		if(isOn == true) {
			System.out.println("Now ringing " + phoneNumber + " on the device");
		} else {
			System.out.println("Mobile phone is switched off");
		}
	}
	
	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answer the call");
		} else {
			isRinging = false;
		}
		
	}
	
	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber && isOn == true) {
			isRinging = true;
			System.out.println("Ringing the call");
		} else {
			System.out.println("Mobile phone is not on or mobile number is different");
			isRinging = false;
		}
		return isRinging;
	}
	
	@Override
	public boolean isRinging() {
		return isRinging;
	}
}
