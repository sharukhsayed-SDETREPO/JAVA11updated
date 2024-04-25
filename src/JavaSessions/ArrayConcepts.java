package JavaSessions;

public class ArrayConcepts {

	public static void main(String[] args) {
		//Array
		//1.static array
		   //-->size is fixed 
		/*---->can only store one type of data ie its homogenous
		
		2.dynamic array
		size dosen't need to be fixed
		arrayList or any collection
		*/
		
		int i[]=new int[4];
		i[0]=21;
		i[1]=30;
		i[2]=40;
		i[3]=50;
		System.out.println(i[1]);
		System.out.println(i.length);
		
		//print all the contents of an array
		for(int y=0;y<i.length;y++) {
			System.out.println(i[y]);
		}
		//default value of any numeric data type is "0"
		
		
		double []d=new double[2];
		d[0]=2.35689;
		d[1]=8.5464;
		
		System.out.println(d[0]+d[1]);
		
		//character array
		
		char []w=new char[2];
		w[0]='a';
		w[1]='@';
		System.out.println(w[0]+w[1]);
		
		
		///String array
		String y[]=new String[3];
		y[0]="Java ";
		y[1]="Python ";
		y[2]="Ruby ";
		for(int z=0;z<y.length;z++) {
			System.out.print(y[z]);
		}
		
		//default value of string array is null because string is treated as object
		//boolean array
		boolean x[]=new boolean[3];
		x[0]=true;
		x[1]=false;
		x[2]=true;
		//////// default value of boolean is always false
		
		
		////object array=not homogenous can store all data types
		Object ob[]=new Object[4];
		ob[0]="TOM";
		ob[1]=25;  
		ob[2]=3.455;
		//ob[3]=false;
		for(int b=0;b<ob.length;b++) {
			System.out.println(ob[b]); //last value will be default null
		}
		
		
		
		int t[]=new int [9];
		t[0]=1;
		System.out.println(t[1]);// this will return default 0
		
		String str[]= new String[7];
		System.out.println(str[0]);///default is nulll because string is treated default as a object
		
		char fg[]=new char[1];
		System.out.println(fg[0]); ///default is also null
		
		
		String [] sample=new String[2];
		sample[0]="test1";
		sample[1]="test20";
	for(String typeofSample: sample) {
		System.out.println(typeofSample);
	}

		
		
	}

}
