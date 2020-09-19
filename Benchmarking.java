import java.util.*;

import java.util.Scanner;

import java.io.*;

class Benchmarking

{

   public static void main(String args[])

   {
       String thisLine = null;
       int tmp = 0;
       ArrayList<Integer> arr = new ArrayList<Integer>();
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter your file name");
       String filename = sc.nextLine();
       
            
       try {

           File file = new File(filename);
           BufferedReader br = new BufferedReader(new FileReader(file));

           while ((thisLine = br.readLine()) != null){
               tmp = Integer.parseInt(thisLine);      //get all the input to the arrayList
               arr.add(tmp);        
               }
                  
           Collections.sort(arr);         //sort the list

           Integer min = arr.get(0);

           Integer max = arr.get(arr.size() - 1); 

           Integer med = 0;
           if (arr.size() % 2 == 1)
               med = arr.get((arr.size() - 1) / 2);
           else
               med = (arr.get((arr.size() - 1) / 2) + arr.get((arr.size()) / 2)) / 2;

           System.out.println("MIN: "+min);
           System.out.println("MAX:"+ max);
           System.out.println("Median: "+med);
       
       }

       catch (Exception e)

       {
            System.out.println("Error E occur! Please double check your filename or make sure your file is in currect location");
       }

   }

}