package week1.day2;

public class Method {
	
	public void sendSms() {
		System.out.println("From oppo");
	}
	
	public long makeCall(long phno) {
		
		return phno;
	}

	public static void main(String[] args) {
		Method PhoneCall=new Method();
		PhoneCall.sendSms();
		System.out.println(PhoneCall.makeCall(1234567890));

	}

}
