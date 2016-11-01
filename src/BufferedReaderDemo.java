//package com.tutorialspoint;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderDemo 
{
   public static void main(String[] args) throws Exception 
   {
      
      InputStream is = null; 
      InputStreamReader isr = null;
      BufferedReader br = null;

      try{
         // open input stream test.txt for reading purpose.
         //is = new FileInputStream("/Users/Shared/Java-Libraries/CourseCD/mediasources/LittleMessage.txt");
    	  is = new FileInputStream("/Users/Shared/Java-Libraries/CourseCD/mediasources/SecretMessage.txt");
         // create new input stream reader
         isr = new InputStreamReader(is);
         
         // create new buffered reader
         br = new BufferedReader(isr);
      
         // creates buffer
         char[] charBuffer = new char[is.available()];
         is.available();
         
         // reads characters to buffer, offset 2, len 10
         br.read(charBuffer, 0, 1142);	// 103
         //System.out.println(charBuffer[0]);
         
         /////////////////////////////////////////////////////
         
         char x;
 		 x = 'A';
 		 System.out.println(x);
 		
 		 char myChar = (char) 65;
 		 System.out.println(myChar);

 		 int i;
 		 i = (int) charBuffer[0];			// i = (int) x;
 		 System.out.println(i);					// prints char representation
 		 
 		 System.out.println(charBuffer[0]);		// prints character
 		 
 		 System.out.println("\n\n");
         
         
         
         //////////////////////////////////////////////////////
         
         
         
         // for each character in the buffer
         for (char c:charBuffer)
         {
            /*
        	 // if char is empty
            if(c == (char)0)
            {
               c='*';
            }
            // prints characters
             
             */
            System.out.print(c);
         }

                  
      }catch(Exception e){
         e.printStackTrace();
      }

      /*
      finally{
       
         // releases resources associated with the streams
         if(is!=null)
            is.close();
         if(isr!=null)
            isr.close();
         if(br!=null)
            br.close();
           
      }
      */
   }
}