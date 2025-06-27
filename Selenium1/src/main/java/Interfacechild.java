
public class Interfacechild implements InterfaceParent {
public void display1()
{
	System.out.println("Hello class1");
}
public void display()
{
	System.out.println("Hello class2");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfacechild obj=new Interfacechild();
		obj.display();
	    obj.display1();

	}

}
