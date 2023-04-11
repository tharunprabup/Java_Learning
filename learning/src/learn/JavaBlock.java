package learn;
import static java.lang.Math.*;

public class JavaBlock {

	static int n1;
	int n2;
	static {
		System.out.println("CSK");
		n1=100;
	}
	static {
		System.out.println("RCB");
		n1=80;
	}
	
	{
		System.out.println("GT");
		n2=50;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JavaBlock n3 = new JavaBlock();
		System.out.println(n1);
		//System.out.println(n2);
	}

}
