package java_programme_basic;

public class SwapingNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("before swap :");
		System.out.println("value of a is: " + a);
		System.out.println("value of b is : "+ b);
		a = a+b; //10+20
		b = a-b; //30-20
        a = a-b; //30-10
        System.out.println("after swaping : ");
        System.out.println("value of a is : "+ a);
        System.out.println("value of b is : "+ b);
	}

}
