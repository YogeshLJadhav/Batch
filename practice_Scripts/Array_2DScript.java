package practice_Scripts;

public class Array_2DScript {

	public static void main(String[] args) {
		int [][]a=new int [2][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		System.out.println("computing value :" +a);

System.out.println("2 D RRAY PRINT "+a[0][1]);


System.out.println("---------matrix array------");

System.out.println("matrix array of length of row"+a.length);
System.out.println("matrix array of length of column "+a[0].length);

    System.out.println("-----jagged value----");


    int[][]b=new int[2][];   //total size of data ----row
    b[0]=new int [3];    //[]row=index value  []=column=total size of perticular column
    b[1]=new int [2];

    b[0][0]=100;
    b[0][1]=200;
    b[0][2]=300;
    b[1][0]=400;
    b[1][1]=500;
    System.out.println("joggal value :"+b[0][1]);
    System.out.println("matrix array of length of row"+b.length);
    System.out.println("matrix array of length of column "+a[0].length);
    System.out.println("matrix array of length of column "+a[1].length);

    System.out.println("--------- literal  matrix array------");

    int[][]d= {{10,20,30,40},{50,60,70,80} };  //literal array
    System.out.println(" literal matrix array of length of row"+d.length);
    System.out.println(" literal matrix array of length of column "+d[0].length);


    System.out.println("-----jagged array ----");
    int[][]e= {{10,20,30,40},{50,60,70,80,90} };
    System.out.println(" literal matrix array of length of row"+e.length);
    System.out.println(" literal matrix array of length of column "+e[0].length);
    System.out.println(" literal matrix array of length of column "+e[1].length);


    System.out.println("---loop matrix array");
    int[][]c= {{10,20,30},{40,50,60}};
    for (int[] element : c) {
    	for(int j=0;j<element.length;j++)    //loop for column
    	{
    		System.out.println("length"+element[j]);
    	}
    }

    System.out.println("'----print in table format----");

    int[][]f= {{10,20,30},{40,50,60}};
    for (int[] element : f) {
    	for(int j=0;j<element.length;j++)    //loop for column
    	{
    		System.out.print( element[j] +"|" );
    	}

    	System.out.println();
    }

	}

}
