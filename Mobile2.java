package week1.day1;

public class Mobile2 {
		public void makeCall()
		{
			String mobileModel="OPPO";
			float mobileWeight=3.2f;
			System.out.println("the Mbile Model is "+mobileModel);
			System.out.println("Mobile Weight is "+mobileWeight);
		}
		public void sendMsg()
		{
			boolean isFullCharged=true;
			int mobileCost=13000;
			System.out.println("Yes fully charged");
			System.out.println("Mobile Cost is " +mobileCost);
	}
		public static void main(String[] args) {
			Mobile2 m2=new Mobile2();
			m2.makeCall();
			m2.sendMsg();
		}

}
