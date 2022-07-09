package collectionconcept;
import java .util.Vector;
public class VectorClass {

	public static void main(String[] args) {
		Vector v= new Vector(10,3);
		System.out.println(v.capacity());
		v.addElement(39);
		v.addElement(true);
		v.addElement("39");
		v.addElement(null);
		v.addElement("frfwsrfs");
		v.addElement(false);
		v.addElement(39.6f);
		v.addElement("frfwsrfs");
		v.addElement(null);
		v.addElement(null);
		v.addElement("frfwsrfs");
		v.addElement(false);
		v.addElement(39.6f);
		v.addElement(false);
		v.addElement("frfwsrfs");
		v.addElement(39.6f);
		v.addElement(39.00);
		v.addElement(39);
		v.addElement("frfwsrfs");
		System.out.println(v);
		v.removeElement(39.6f);
		System.out.println(v);
        v.removeElementAt(3);
        System.out.println(v.capacity());
        System.out.println(v);
        Object o=(Object)v.get(0);
        System.out.println(o);
        System.out.println(v.capacity());
	}

}
