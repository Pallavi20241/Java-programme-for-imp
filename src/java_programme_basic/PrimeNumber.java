package java_programme_basic;

public class PrimeNumber {
	//1,2,3,7,11,17divide by 1and itself only that is prime no

	public static void main(String[] args) {
		
int no=24;//take any no
int temp=0;

for (int i=2;i<=no-1;i++) //using for loop and give condition
{
	if (no% i==0) {
		temp=temp+1;
		}
}
 
      if (temp==0) {
    	  System.out.println(no+ "this is prime Number");
    	  
      }
      else {
    	  System.out.println(no+ "this is not prime Number");
      }
	}

}
