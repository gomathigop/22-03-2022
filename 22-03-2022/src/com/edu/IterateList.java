package com.edu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateList {

 public static void main(String[] args) {
  ArrayList<Integer> ilist=new ArrayList<Integer>();
  for(int i=1;i<=10;i++) {
   ilist.add(i);
  }
  
  System.out.println(ilist);//[1,2,3....10]
  
  //individual elements to display
  Iterator<Integer> it=ilist.iterator();
  while(it.hasNext()) {
   System.out.println(it.next());
  }
  
  //using for loop
  for(Integer i:ilist) {
   System.out.println(i);
   
  }
  
  //Using ListIterator
  ListIterator<Integer> lob=ilist.listIterator();
  //forward direction
  System.out.println("ListIterator forward direction");
  while(lob.hasNext()) {
   System.out.println(lob.next());
  }
  
  System.out.println("ListIterator reverse direction");
  while(lob.hasPrevious()) {
   System.out.println(lob.previous());
  }
 }

}



