package java_programme_basic;

public class Factorial {//factorial number 5!=5*4*3*3*2*1=120

	public static void main(String[] args) {
		
		int i,fact=1;
		int x=5;
		
		for(i=1;i<=x;i++) 
		{
		fact	=fact*i;
		}
		System.out.println("given number " +x +" factorial is "  +fact);
	}

}
