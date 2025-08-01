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
