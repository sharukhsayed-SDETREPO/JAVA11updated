package JavaSessions;

public class IncrementalandDecrementalConcept {

	public static void main(String[] args) {
		//++----> Inc rement by 1
		//-- -----Decrement by 1
		
		/*1.Post increment
		 * 
		 */
       int a=2;
       int b=a++;
 
       int c =-7;
       int d =c++;
       System.out.println(a);//3
       System.out.println(b);//2
       System.out.println(c);//-6
       System.out.println(d);//-7
       
       
       
     System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");  
       
       
       
       /*Pre increment
        * 
        */
       
       int s=7;
       int t=++s;
       int u=-9;
       int v=++u;
       
       System.out.println(s);
       System.out.println(t);
       System.out.println(u);
       System.out.println(v);
       
       System.out.println("@22222222222222222222222222222222222@");
       //Post decrement
       int m=5;
       int n=m--;
       int o=-9;
       int p=o--;
       System.out.println(m);
       System.out.println(n);
       System.out.println(o);
       System.out.println(p);
       
       System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
       
       //pre decrement
       int f= 14;
       int g= --f;
       int h= -12;
       int i= --h;
       System.out.println(f);
       System.out.println(g);
       System.out.println(h);
       System.out.println(i);
       System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
       
       
       

       
       int tt=10;
       int pp=tt++ + 10;
       System.out.println(tt);//11
       System.out.println(pp);    //20
       System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
       
       int yy=20;
       int hj=++yy +7;
       System.out.println(yy);//21
       System.out.println(hj);//28
       
       
       int lk=5;
       int yu=++lk + ++ lk;
       System.out.println(lk);//7
       System.out.println(yu);//13
       
       
       int oo=26;
       int ee=++oo + --oo + oo++;
       System.out.println("OO start");
       System.out.println(oo);//27
       System.out.println(ee);//27+26+26
       System.out.println("EE");
       
       
       int rr=10;
       int re =++rr + ++rr;
       System.out.println(rr);
       System.out.println(re);
       
       
       //Pre--------increment/decrement before any other operations on the line
     //Post-----Do the operation on the line first before inc/dec
	}

}
