package interface_.Phone;

public class PhoneMain {
	public static void main(String[] args) {
		ITelephone ankushsPhone;
		
		ankushsPhone = new Deskphone(98653777);
		ankushsPhone.poweron();
		ankushsPhone.callPhone(98653777);
		ankushsPhone.answer();
		
		ankushsPhone = new MobilePhone(87748986);
		ankushsPhone.poweron();
		ankushsPhone.callPhone(87748986);
		ankushsPhone.answer();
		
		ankushsPhone = new SmartPhone(67767785);
		ankushsPhone.poweron();
		ankushsPhone.callPhone(67767785);
		ankushsPhone.answer();
	}
}
