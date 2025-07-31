import java.util.*;

public class Main {
    public static void main(String[] args) {
      for(int i=0;i<4;i++){
        for(int j=0;j<5;j++){
          System.out.print('*');
        }
        System.out.println();
      }
  }
}

Output:
*****
*****
*****
*****

// Hollow Reactangle

  import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=4;
      int m=5;
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          if(i==0 || i==n-1 || j==0 || j==m-1){
            System.out.print('*');
          }else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
  }
}

Output:
*****
*   *
*   *
*****

// half left right angle
import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=4;
      int m=5;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          System.out.print('*');
        }
        System.out.println();
      }
    }
  }

Output:
*
**
***
****
  
import java.util.*;
// reverse of half left right angle triangle
public class Main {
    public static void main(String[] args) {
      int n=4;
      int m=5;
      for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
          System.out.print('*');
        }
        System.out.println();
      }
    }
  }

Output:

****
***
**
*
// inverted half pyramid
  import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=4;
      int m=5;
      for(int i=1;i<=n;i++){
        // print spaces;
        for(int j=1;j<=n-i;j++){  
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }

Output:
   *
  **
 ***
****

import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=4;
      int m=5;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
          System.out.print(j+" ");
        }
        System.out.println();
      }
    }
  }

Output:

1 2 3 4 
1 2 3 
1 2 
1 


  import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=5;
      int number=1;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          System.out.print(number+" ");
          number++;
        }
        System.out.println();
      }
    }
  }

Output:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

  import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=5;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          int sum=i+j;
          if(sum%2==0){
            System.out.print("1 ");
          }else{
            System.out.print("0 ");
          }
        }
        System.out.println();
      }
    }
  }

Output:
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

    // Butterfly pattern
import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=4;
      //upper half
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        int spaces = 2*(n-i);
        for(int j=1;j<=spaces;j++){
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        System.out.println();
      }
      // lower half
      for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        int spaces = 2*(n-i);
        for(int j=1;j<=spaces;j++){
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }

Output:

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
