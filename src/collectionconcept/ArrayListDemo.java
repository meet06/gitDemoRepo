package collectionconcept;  // introduced in 1.2 version
import java.util.*;
import java.io.*;
public class ArrayListDemo
{

	public static void main(String[] args)
	{
  /*	  ArrayList <String> al=new ArrayList<String>();
	      al.add("jatin");
	      al.add("anlit");
	      al.add("true");
	      System.out.println(al);
	      al.add("parit");
	      al.add(null);
	      al.add(2, "false");
	      al.add(1,"new ");
	      System.out.println(al);
	     al.remove(al.indexOf("true"));
	    al.indexOf("anlit");
	     System.out.println(al);
	     ArrayList <String> al1=new ArrayList<String>();
	       al1.add("dtgdhg");
	       al1.add("gdgjgjg");
	       al1.addAll(al);
	       System.out.println(al1);     
		  ArrayList l= new ArrayList();
		     l.add(23);
		     l.add(45);
		 //    l.add(null);
		   //  l.add("Reference");
		     l.add(23);
		     l.add(56);
		     l.add(35);
		//     l.add(244.00);
		     l.add(23);
		//     l.add("vjxbdjgdg");
	           l.add(23);
		     l.add(45);
		     l.add(null);
		     l.add("Reference");
		     l.add(23);
		     l.add('s');
		     l.add(3.5);
		     l.add(24.98);
		     l.remove(12);       
		     System.out.println("Before sorting AL Object"+"    "+l);
		   //  l.addAll(l);
		     Collections.sort(l,new My());
		     System.out.println("After Sorting AL object"+"     "+l);
		   //  System.out.println(l);
		     System.out.println(l.contains(23));
		     System.out.println(l.containsAll(l));
		     l.removeAll(l);
		     System.out.println(l);
		     System.out.println(l.isEmpty());
		     System.out.println(l.containsAll(l));
		     System.out.println(l.contains(23));
		     */
		LinkedList ll=new 	LinkedList();
		ll.add("M-k");
        ll.add("R-ky");
        ll.add("N-ra");
		
	      	ArrayList l=new ArrayList();
	      	List l5=Collections.synchronizedList(l);
	      
		         l.add("MARTIN");
		         l.add("Alex");
		         l.add("Mark");
		         l.add("Ricky");
		         l.add("NOara");
		         l.add("peter");
		         l.remove("Ricky");
		         
		         l.add(35);
		         l.add(442);
		         l.add(3223);
		         l.add(35);
		         l.add(65);
		         System.out.println(l);
               System.out.println(   l.contains("ponting"));
                  System.out.println(l);
      		    System.out.println(  l.isEmpty());
                   l.add(3, "Fatehji");
                   System.out.println(l);
                   l.remove(3);
                   System.out.println(l);
                  l.addAll(2, ll);
                   System.out.println(l);
                System.out.println(    l.get(3));
             System.out.println(   l.set(1, "robert"));
             System.out.println(l.lastIndexOf(35));
             System.out.println(l);
               System.out.println(l.retainAll(ll));
               System.out.println(l);
              
               System.out.println(l.size());
             ArrayList  l1=new  ArrayList(ll);
             System.out.println(l1);
      //       System.out.println(l.equals(l1));
             
             
             LinkedList ll1=new 	LinkedList();
             ArrayList al=new ArrayList(); 
             System.out.println(al instanceof Serializable);
             System.out.println(al instanceof Cloneable);
             System.out.println(ll1 instanceof Serializable);
             System.out.println(ll1 instanceof Cloneable);
             System.out.println(al instanceof RandomAccess);
             System.out.println(ll1 instanceof RandomAccess);
              ll1.add(632);
              ll1.add("632");
              ll1.add(null);
              ll1.add(true);
              ll1.add(false);
              System.out.println(ll1);
              ll1.addFirst(30);
              ll1.addLast("String");
              System.out.println(ll1.getFirst());
              System.out.println(ll1.getLast());
              System.out.println(ll1);
              ll1.removeFirst();
              ll1.removeLast();
              System.out.println(ll1);
           System.out.println(   ll1.set(0, 66336));
              System.out.println(ll1);
	}

}
