package practice_Scripts;

import java.util.ArrayList;

public class Collection_Frem {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		/*a.add(100);
		a.add(200);
		a.add(300);
		System.out.println("object contain in list is "+a.contains(500));
		System.out.println("object contain in list is "+a.contains(200));

		ArrayList a1=new ArrayList();
		a1.add("aa");
		a1.add("bb");
		System.out.println("all object contain in list for both call :"+a.containsAll(a1));

		a1.addAll(a);
		System.out.println(a1);*/

		ArrayList a2=new ArrayList();
		a2.add(100);
		a2.add(200);
		a2.add(300);
		a2.add("aa");
		a2.add("bb");

		a2.remove(1);
		System.out.println(a2);
		/*a2.clear();
		System.out.println("all data is cleared "+a2);*/



	}

}
