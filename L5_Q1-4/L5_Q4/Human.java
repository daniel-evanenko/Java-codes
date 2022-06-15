package L5_Q4;

public class Human
{
	private String id;
	private String name;
	private int day;
	private int month;
	private int year;
	private int age;
	public String getId() {
		return id;
	}
	public Human(String id,String name,int day,int month,int year)
	{
		setId(id);
		setName(name);
		setDay(day);
		setMonth(month);
		setYear(year);
		setAge();
	}
	public void setId(String id)
	{
		if(id.length()!=9)
			this.id="000000000";
		else 
		{
			for(int i=0;i<9;i++)
				if(id.charAt(i)<'0' || id.charAt(i)>'9')
				{
					this.id="000000000";	
					break;
				}
		this.id=id;
		}
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		boolean flag=true;
		if(name.length()>0)
		{
			for(int i=0;i<name.length();i++)
			{
				if(name.charAt(i)<'a' || name.charAt(i)>'z')
				{
					this.name = "NULL";
					flag=false;
					break;
				}
			}
		}
		if(flag)
			this.name = name;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day)
	{
		if(day>31 || day<=0)
			this.day =1;
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month)
	{
		if(month>12 || month <=0)
			this.month = 1;
		else
			this.month = month;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int year)
	{
		if(year<1901 || year>2021)
			this.year = 2021;
		else
			this.year = year;
	}
	public int getAge() {
		return age;
	}
	public void setAge()
	{
		this.age = (2021-this.year);
	}
	
	public void birthDay()
	{
		this.age+=1;
	}
	
}
