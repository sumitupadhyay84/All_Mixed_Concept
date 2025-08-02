// 2D in java
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int row=sc.nextInt();
      int col=sc.nextInt();
      int[][] numbers=new int[row][col];
      
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          numbers[i][j]=sc.nextInt();
        }
      }
      
      int x=sc.nextInt();
      
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          if(numbers[i][j]==x){
            System.out.println("x found at the location of (" + i + ", " + j + ")");
          }
        }
      }
  }
}

// Reverse a string 
import java.util.*;

public class Main {
    public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("hello");
      for(int i=0;i<sb.length()/2;i++){
          int front=i;
          int end=sb.length()-1-i;
          
          char Front = sb.charAt(front);
          char End = sb.charAt(end);
          
          sb.setCharAt(front,End);
          sb.setCharAt(end,Front);
      }
      System.out.println(sb);
  }
}

// Hashset in java // it is unordered in nature
HashSet in Java

import java.util.HashSet;
import java.util.Iterator;


public class Hashing {
   public static void main(String args[]) {
       HashSet<Integer> set = new HashSet<>();
       //Add
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(1);

       //Size
       System.out.println("size of set is : " + set.size());

       //Search
       if(set.contains(1)) {
           System.out.println("present");
       }

       if(!set.contains(6)) {
           System.out.println("absent");
       }

       //Delete
       set.remove(1);
       if(!set.contains(1)) {
           System.out.println("absent");
       }

       //Print all elements
       System.out.println(set);

       //Iteration - HashSet does not have an order
       set.add(0);
       Iterator it = set.iterator();
        while (it.hasNext()) {                 // it return true untill elenent contains;
           System.out.print(it.next() + ", "); // it iterate all the element without add the increment order;
       }
       System.out.println();
       //isEmpty
       if(!set.isEmpty()) {
           System.out.println("set is not empty");
       }
   }
}

// HashMap in Java 

HashMap in Java

import java.util.*;


public class Hashing {
   public static void main(String args[]) {
       //Creation
       HashMap<String, Integer> map = new HashMap<>();


       //Insertion
       map.put("India", 120);
       map.put("US", 30);
       map.put("China", 150);


       System.out.println(map);


       map.put("China", 180);
       System.out.println(map);

       //Searching
       if(map.containsKey("Indonesia")) {
           System.out.println("key is present in the map");
       } else {
           System.out.println("key is not present in the map");
       }


       System.out.println(map.get("China")); //key exists
       System.out.println(map.get("Indonesia")); //key doesn't exist


       //Iteration (1)
       for( Map.Entry<String, Integer> e : map.entrySet()) {
           System.out.println(e.getKey());
           System.out.println(e.getValue());
       }


       //Iteration (2)
       Set<String> keys = map.keySet();
       for(String key : keys) {
           System.out.println(key+ " " + map.get(key));
       }


       //Removing
       map.remove("China");
       System.out.println(map);


   }
}



