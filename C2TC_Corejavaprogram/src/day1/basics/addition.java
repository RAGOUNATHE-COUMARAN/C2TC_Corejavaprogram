package day1.basics;

public class addition {
//this is the addition program 
// args is the array that the pace is given to the below variablr 0=a and 1=b
// parseint is used to convert the string into integer 
	public static void main(String[] args) {
	int a,b,c;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	c=a+b;
	System.out.println("addition of  a="+a+" and b="+b+"is "+c);

	}

}
