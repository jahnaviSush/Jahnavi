package Programms;
import java.util.Scanner;

public class Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entered a character: ");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("enterd  char"+ch+ "is a Vowel");
			
		}else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("entered char"+ch+ "is a Consonant");
		}
		else
			System.out.println("Not an alphabet");
			

	}

}
