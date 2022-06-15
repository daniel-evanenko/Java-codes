import java.util.Scanner;

public class HomeWork_Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] medicationId = new int[150]; // all array = 0
		int [] agesGroup = new int[4]; // 0 =0-10, 1=11-3, 2 = 30-50, 3 = 51-120
		int i,age,medId,numOfMed,maxMed=0;
		int maxMedId=0;
		boolean flag=false;
		System.out.println("please enter your age");
		age = input.nextInt();
		while(age<-1 || age>120)
		{
			System.out.println("ERROR - please enter your age again");
			age = input.nextInt();
		}
		while(age!=-1)
		{
			System.out.println("please enter the id number of medication(1-150)");
			medId = input.nextInt();
			while(medId<1 || medId>150)
			{
				System.out.println("ERROR - please enter the id number of medication(1-150)");
				medId = input.nextInt();
			}
			
			System.out.println("please enter how units you wany to buy");
			numOfMed = input.nextInt();
			medicationId[medId-1] = numOfMed; // 0-149
			if(age<11) // 0-10
				agesGroup[0] = numOfMed;
			else if(age<31) // 11-30
				agesGroup[1] = numOfMed;
			else if(age<51) // 30-50
				agesGroup[2] = numOfMed;
			else // 51+
				agesGroup[3] = numOfMed;
			
			System.out.println("please enter your age");
			age = input.nextInt();
			while(age<-1 || age>120)
			{
				System.out.println("ERROR - please enter your age again");
				age = input.nextInt();
			}
			if(numOfMed>maxMed && medId!= maxMedId) // to find the most consumed medicine
			{
				maxMed=numOfMed;
				maxMedId = medId;
				flag=false; // if there is a new max number so the last ones dont count.
			}
			else if(numOfMed==maxMed && medId!= maxMedId && !flag) // !flag becouse there is no need to turn the flag more then once.
				flag=true; // indicates that there is more then 1 most consumed medicine
		}
		age=0;
		medId=0; // reuse, =  max bought medicine in age group
		for(i=0;i<4;i++) //0=1, 1=2, 2=3, 3=4, 4=5
		{
			if(agesGroup[i]>medId) 
			{
				medId = agesGroup[i];
				age=(i+1);
			}
			else if(agesGroup[i]==medId)// if there is more then 1 group then add the index of it
			{
				// no need to update the maxMed becouse its equal to the last group
				age*=10;
				age+=(i+1);
			}
		}
		do
		{
			switch (((age%10)-1)) // age =0-3
			{
				case 0:
					System.out.println("Age group between 0-10 bought "+agesGroup[0]+" medications");
					break;
				case 1:
					System.out.println("Age group between 11-30 bought "+agesGroup[1]+" medications");
					break;
				case 2:
					System.out.println("Age group between 30-50 bought "+agesGroup[2]+" medications");
					break;
				case 3:
					System.out.println("Age group above 51 bought "+agesGroup[3]+" medications");
					break;
			}
			age/=10; // next group
		}while(age>0);
		
		System.out.println("The serial numbers of the medicines that no one bought: ");
		for(i=0;i<150;i++)
			if(medicationId[i]==0)
				System.out.print(i+1+" ");
		System.out.println();// \n
		System.out.print("The serial number of medicine consumed the most: "+maxMedId+" ");
		if(flag)
			for(i=0;i<150;i++)
				if(medicationId[i]==maxMed && i+1!=maxMedId) // maxMedId = serial num+1.
					System.out.print(i+1+" ");
		input.close();
	}

}
