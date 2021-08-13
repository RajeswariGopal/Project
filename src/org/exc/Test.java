package org.exc;
import java.util.*;
import java.util.stream.Collectors;

public class Test {


	public static void main(String[] args)
    {
  	List<Integer> li = new ArrayList<>();
  	li.add(0, 10);
  	li.add(1, 20);
  	li.add(2, 30);
  	li.add(3, 40);
  	li.add(4, 50);
  	li.add(5, 60);
  	li.add(6, 70);
  	li.add(7, 80);
  	  	System.out.println("Before :" +li);
  	List<Integer> li1 = new ArrayList<>();
  	li1.add(0, 100);
  	li1.add(1, 200);
  	li1.add(2, 300);
  	li1.add(3, 400);
  	li1.add(4, 500);
  	li1.add(5, 600);
  	li1.add(6, 700);
  	li1.add(7, 8000);
System.out.println("Before :"+ li1);
  	boolean removeAll = li.removeAll(li);
  	boolean removeAll2 = li1.removeAll(li1);
  	System.out.println("After :"+ li);
  	System.out.println("After :" +li1);
  	  	}
}