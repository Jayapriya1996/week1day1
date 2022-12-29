package week1.day1;

public class Car {
public void applyBreak() {
	System.out.println("Applied Break");
}
public void soundHorn()
{
	System.out.println("sound Horn");
}
public static void main(String[] args) {
	Car car1=new Car();
	car1.applyBreak();
	car1.soundHorn();
}
}
