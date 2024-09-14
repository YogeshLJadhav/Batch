package practice_Scripts;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListAndSet {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		a[0][1]=10;
		System.out.println(a);



	/*	ArrayList al=new ArrayList();    //simple object creation

		List L=new ArrayList();//    referance object creation

		HashSet hs=new HashSet();//simple object
		Set s=new HashSet();// referance object creation */


		  Set s=new HashSet();
		  s.add(10);
		  s.add("Yogesh");

		  System.out.println(s);

		  Set<Integer> s1=new HashSet<>();         //allow only integer value dose not allowed mix data types this is used for retriction data
		  s1.add(100);
		  s1.add(200);
		 // s1.add("aaa");

		  Set<String> s2=new HashSet<>();
		 // s2.add(100);

		 s2.add("aaa");

		 Set s3=new TreeSet();
		 s3.add(90);
		 s3.add(190);
		 s3.add(50);
		 s3.add(30);

		 System.out.println(s3);


		 Set s4=new TreeSet();
		 s4.add("asfg");
		 s4.add("jhgc");
		 s4.add("yfd");
		 s4.add("sfdg");

		 System.out.println(s4);



	}

}
