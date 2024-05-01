package java_programme_basic;

public class FibbianciSeries {//Fibonacci Series 0,1,1,2,3,5,8,13,21etc

	public static void main(String[] args) {
		
		int no1=0,no2=1,no3;
		int i,count=10;
		System.out.println(no1 + " "+no2);

		for(i=2;i<count;i++) {
			no3=no1+no2;
			System.out.println(" "+no3);
			
			no1=no2;
			no2=no3;
			
		}
	}

}
