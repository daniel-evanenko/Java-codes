import java.util.Scanner;

public class HomeWork_Q6 {
	static String Cicer_cipher(String msg,int shift)
	{
		String result="";
		char ch;
		for(int i = 0;i<msg.length();i++)
		{
			ch = msg.charAt(i);
			if(ch=='!')
			{
				if(shift==1)
					shift=-1;
				else
					shift=1;
			}
			if(Character.isLetter(ch))
			{		
				if(Character.isLowerCase(ch))
				{
					if(ch=='a'&& shift==-1)
						result +='z';
					else
						result +=(char)((ch+shift-97)%26+97);
				}

			
				else if(Character.isUpperCase(ch))
				{
					if(ch=='A'&& shift==-1)
						result +='Z';
					else
						result +=(char)((ch+shift-65)%26+65);
				}
			}
			else
			{
				result+=ch;
			}
		}
		return result;	
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String result="";
		System.out.println("please enter your messege");
		String msg = input.nextLine();
		System.out.println("your message: "+msg);
		result = Cicer_cipher(msg,1);
		System.out.println("The encrypted message: "+result);
		result = Cicer_cipher(result,-1);
		System.out.println("The decrypted message: "+result);
		input.close();
	}
}
