package L5_Q1;

public class Time {
	private int hour;
	private int min;
	private int sec;
	
	public Time()
	{
		hour=0;
		min=0;
		sec=0;
	}
	public Time(int hour,int min,int sec)
	{
		setHour(hour);
		setMin(min);
		setSec(sec);
	}
	public int getHour()
	{
		return hour;
	}
	public void setHour(int hour)
	{
		if(hour>0 && hour <24)
			this.hour = hour;
		else
			this.hour = 0;
	}
	public int getMin()
	{
		return min;
	}
	public void setMin(int min)
	{
		if(min>=0 && min<60)
			this.min = min;
		else
			this.min = 0;
	}
	public int getSec()
	{
		return sec;
	}
	public void setSec(int sec)
	{
		if(sec>=0 && sec<60)
			this.sec = sec;
		else
			this.sec = 0;
	}

}
