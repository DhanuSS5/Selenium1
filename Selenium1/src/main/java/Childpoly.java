
public class Childpoly extends Polymorphism {
	public void calc(int a,int b)
	{
		super.calc(8,9);
		int mul=a*b;
		System.out.println("MUL="+mul);	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childpoly ob=new Childpoly();
		ob.calc(5, 10);
		

	}

}
