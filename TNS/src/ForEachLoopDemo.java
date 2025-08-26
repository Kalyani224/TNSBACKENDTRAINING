//Program to demonstrate for each loop

public class ForEachLoopDemo {
	public static void main(String[] args) {
		int a[]= {50,60,70,80,90};	
//for integer array
		for(int i:a)
		{
		System.out.println(i);	
		}
		
		char ch[]= {'k','a','l','y','a','n','i'};
		for(char c:ch)
		{
			System.out.print(c);		
		}
		System.out.println(" ");
		String s1[]= {"Java","programming","learning"};
//for String array
		for(String s:s1)
		{
			System.out.print(s+" ");		
		}
	}
}