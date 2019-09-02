package interface_.Phone;

public class Deskphone implements ITelephone {
	int myNumber;
	boolean isRinging;
	
	public Deskphone(int myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void poweron() {
		System.out.println("Powering on the device");
		
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on the device");
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
		if(phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("Ringing the call");
		} else {
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}
	
}
