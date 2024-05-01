package java_programme_basic;//1,153,370,371,407etc armstrong no

public class ArmstrongNO {//153=1^3+ 5*5*5 +3^3 =  3+125+27  =153this armstrong

	
	public static void main(String[] args) {
	
		int b=0,a,temp;
		int no=153;
		temp=no;
		while (no>0) {
			a=no%10;
			no=no/10;
			b=b+(a*a*a);
			
		}
		if(temp==b) 
		{
			System.out.println(+ b +  "Number is Armstrong");
		}
		else {
			System.out.println(+ b +  "Number is Not Armstrong");
		}

	}

}
