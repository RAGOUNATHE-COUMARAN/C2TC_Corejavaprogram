package Day4.firstpackage;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class ExecutorBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//accessing same package class
			Base64 b1=new Base64();
			b1.methodDefault();
			b1.methodProtected();
			b1.methodPublic();
			b1.varDefault=11;
			b1.methodDefault();
			
			//private member can't accessible
			/*b1.varPrivate=21; 
			b1.methodPrivate();*/
			b1.varProtected=31;
			b1.methodProtected();
			b1.varPublic=41;
			b1.methodPublic();
			
			//instance of operator
			// refer the instanceofusage.txt
			System.out.println(b1 instanceof Base64);
			/*
			 * Person p=new Person(); System.out.println(p instanceof Base); //CTE
			 * Incompatible types
			 */	}

			

	}


