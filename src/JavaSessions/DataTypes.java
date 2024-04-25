package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
	
   //Data type
		/* 1. Non Primitive 
		 * 2. Primitive data types 
		 * 2.1 Boolean :- true ,false
		 * 2.2 Numeric 
		 * 2.2.1 Integer/Integral :- byte,short.int,long 
		 * 2.2.2 Character :- char
		 * 2.2.3 Floating point :- float,double
		 */
		
		
       //1.byte:
//		size:- 1 byte =8 bits
		/*
		 * range -2^7 - 2^7(-)
		 * 
		 */
      byte b= 10;
      byte b1=-10;
      byte b2=0;
      //for out of range values
      byte y=(byte)250; //op will be -6
      
      
      //2. short ;
      /*
       * 1 short = 16 bits/2 bytes 
       * range -2^15 - 2 ^15(-1)
       */
      
      short a = 10;
      /*
       * 
       * 3. int 
       * 1 int = 4 bytes or 32 bits
       * range = -2^31 - 2^31(-1)
       * 
       *  
       * 
       */
      
      int a1 =52;
      /* 4. long
       * 1 long = 8 bytes or 64 bits
       * range = -2^63 to 2^63(-1)
       */
      long ui= 12324354365543446l;
      
      
      //Floating point
      //size same as int 32 bits 
      //range after decimal we can store 8 digits
      float g=1.23f;
      float o=(float)12.44;
      float o1=100;  // no f or (float) required
     
      
      
      double rt=12.333333; // no of size same as long,after decimal upto 15 digits
      
      
      
      //char 
      char f1 = '4'; //single quoted characters
      
      boolean r5 =true, r6=false;
	}

}
