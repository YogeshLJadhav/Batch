package practice_Scripts;

public class MethodOverLoading         //compile time polymorphism
{
     void white(int a,String b)
     {
    	System.out.println("method __________1 "+a+"  "+b);
     }
     void white(int a)
     {
    	System.out.println("method__2 "+a);
     }
	public static void main(String[] args) {

		MethodOverLoading ab=new MethodOverLoading();
		ab.white(100);
		ab.white(455, "yogesh");
	}

}
