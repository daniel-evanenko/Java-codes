package L5_Q1;

public class Main {

	public static void main(String[] args) {
		Time time1 = new Time(11,10,0);
		Time time2 = new Time();
		System.out.println("the time is - "+time1.getHour() +":"+time1.getMin()+":"+time1.getSec());
		System.out.println("the time is - "+time2.getHour() +":"+time2.getMin()+":"+time2.getSec());
	}

}
