package collectionconcept;
import java.io.Serializable;
import java.util.*;
public class LinkedListDemo {
	     public static void main(String[] args) {
		      LinkedList<Serializable>  ll=new LinkedList<Serializable>();
		      ll.add("jatin");
		      ll.add(65.8);
		      ll.add(16);
		      ll.add('g');
		      System.out.println(ll);
		      ll.add(true);
		      ll.add(null);
		      System.out.println(ll);
		      ll.addFirst(false);
		      System.out.println(ll);
		      ll.add(4, ll);
		      System.out.println(ll);
		      ll.remove(4);
		      ll.add(16);
		      System.out.println(ll);
		      System.out.println(ll.indexOf(16));
		      System.out.println(ll.lastIndexOf(16));
		      LinkedList<Serializable>  l2=new LinkedList<Serializable>();
		      l2.add(234);
		      l2.add(23.87);
		      l2.add(l2);
		      System.out.println(l2);
		      l2.addAll(ll);
		      System.out.println(l2);
		      l2.addAll(5, ll);
              System.out.println(l2);
              System.out.println(l2.contains(234));
              System.out.println(l2.contains(24));
              System.out.println(l2.containsAll(ll));
              System.out.println(l2.equals(ll));
	}
}	
	       
	        		
	      