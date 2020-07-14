import java.util.Arrays;

public class OneDim
   {
   
      private int [] list;
      public OneDim (int [] array)
      {
         list = array;
      }
      // post condition: find and return the max element in obj
      public int findMax()
      {
         int i = list [0];
    	  for (int k = 0; k <list.length; k++){
        	 if (list[k] > i){
        		 i = list[k];
        	 }
         }
    	  return i;
      }
      // post condition: find and return the index of the max element in obj
      public int findMaxIndex()
      {
    	  
    	  int i = list [0]; int x = 0;
    	  for (int k = 0; k <list.length; k++){
        	 if (list[k] > i){
        		 i = list[k];
        		 if (i == list[k]) x = k;
        	 }
         }
    	  return x;
      }
   
      // post condition: find and return the min element in obj
      public int findMin()
      {
    	  int i = list [0];
    	  for (int k = 0; k <list.length; k++){
        	 if (list[k] < i){
        		 i = list[k];
        	 }
         }
    	  return i;
      }
      // post condition: find and return the index of the min element in a
      public int findMinIndex()
      {
    	  int i = list [0]; int x = 0;
    	  for (int k = 0; k <list.length; k++){
        	 if (list[k] < i){
        		 i = list[k];
        		 if (i == list[k]) x = k;
        	 }
         }
    	  return x;
      }
   
      // post condition: check to see if target can be found in list or not.  If yes, returns
   //                             true; otherwise, returns false.
      public boolean find (int target)
      {
    	   
    	  for (int k = 0; k <list.length; k++){
        	 if (list[k] == target){
        		 return true;
        	 }
         }
    	  return false;
      }
   
      // post condition: put all the negative numbers in a in an array and return it
      public int[] posArray ()
      {
    	

          int count=0;
          for(int ele: list)
          {
             if(ele>0)
                count++;
          }
          int [] pos=new int [count];
          int k=0;
          for(int ele: list)
          {
             if(ele>0)
             {
                pos[k]=ele;
                k++;
             }
          }
          return pos; 
      }
   
      // post condition: put all the postivie numbers in list in an array and return the array
      public int[] negArray()
      {
          int count=0;
          for(int ele: list)
          {
             if(ele<0)
                count++;
          }
          int [] neg=new int [count];
          int k=0;
          for(int ele: list)
          {
             if(ele<0)
             {
            	neg[k]=ele;
                k++;
             }
          }
          return neg; 
      }
   	
      // post condition: sum up all the numbers in list and return the sum
      public int sum ()
      {
    	  int x =0;
    	  for (int k = 0; k <list.length; k++){
    		  x += list[k];
    	  } 
    	  return x;
      }
      // post condition: find the average of all the numbers in list 
      public double average()
      {
    	  double x =0;
    	  for (int ele : list){
    		  x += ele;
    	  } 
    	  return x/list.length;
      }
   	
      // post condition: put all the even numbers in list and return the array
      public  String evenMembers()
      {
    	  String even= "";
    	  for (int ele : list){
    		  if (ele%2 ==0){
    			  even += "[" +ele + "]";
    		  }
    	  }
    	  return even;
      	
      }
   	
      // post condition: put all the odd numbers in list  and return the array	 
      public  String oddMembers()
      {
    	  String odd= "";
    	  for (int ele : list){
    		  if (ele%2 ==1){
    			  odd += "[" + ele + "]";
    		  }
    	  }
    	  return odd;
      }
   	
      // post condition: print all the elements in list onto the screen
      public String toString ()
      {
    	  String aRay= "";
    	  for (int k = 0; k <list.length; k++){
    			  aRay += "[" +list[k] + "]";
    		  }
    	  return aRay;
      }
       
   
   
   }
   