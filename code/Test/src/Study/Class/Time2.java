package Study.Class;

class Time {
	private long hour;
	private long minute;
	private long second;
	private long time;

	public Time() {
		time = System.currentTimeMillis() / 1000;
		hour = time / (60 * 60) % 24;
		minute = time % 3600 / 60;
		second = time % 3600 % 60;
		System.out.println(hour + ":" + minute + ":" + second);
	}
}

public class Time2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();

	}

}
