package week1.day1;

public class Mobile {
	private void makeCall() {
		String mobileModel = "samsungJ7";
		float mobileWeight = 19.4f;
		System.out.println("mobileModle : " +mobileModel);
		System.out.println("mobileWeight : " + mobileWeight);
				
				
		

	}
	 private void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 19567;
		
		System.out.println("isFullCharge : " + isFullCharged);
		System.out.println("mobileCost : " + mobileCost);

	}

	

	public static void main(String[] args) {
		Mobile  mob = new Mobile();
		mob.makeCall();
		mob.sendMsg();
		System.out.println("This is my mobile");
		
		

	}

}
