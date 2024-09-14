package practice_Scripts;

   class AA_02
   {
	   void world_A()
	   {
		   System.out.println("grandfather   world A");
	   }
   }

   class BB_02 extends AA_02
   {
	   void world_B()
	   {

		   System.out.println("father   world B");
	   }
   }

public class CC_02 extends BB_02
   {
	void world_C()
	{
		System.out.println("child   world C");
	}

	public static void main(String[] args) {

		CC_02 m=new CC_02();             //multilevel inheritance
		m.world_A();
		m.world_B();
		m.world_C();


	}

}
