package cursorconcept;

import java.util.Enumeration;
import java.util.Vector;

public class CursorThroughEnumeration {
        public static void main(String[] args) {
			Vector v= new Vector();
		//	Vector v1= new Vector();
            for (int i=1;i<=20;i++)
			{
				v.add(i);}
			System.out.println(v);	
			Enumeration en=v.elements();
			System.out.println(en.getClass().getName());
			while(en.hasMoreElements()) {
				Integer i1=(Integer)en.nextElement();
				  if(i1%2==0) 
				System.out.print(i1+" ");
				
			/*	if(i1%2==0) {
					v1.add(i1);
					System.out.println(v1);
				}*/
			}
		}
}
