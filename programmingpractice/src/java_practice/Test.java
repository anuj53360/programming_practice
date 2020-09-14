package java_practice;

import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
    
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 
        System.out.println("Hi, " + name + ".");    


      int flag=0;
      if(name.contains("HH")){
          System.out.println("NO");
      flag=1;
      }    
        else{
            for(int i=0;i< name.length(); i++){
                if(name.charAt(i)=='.'){
                  name=name.replace(".","B");  
                 }
            }
        }
        if(flag==0){
            System.out.println("YES");
            System.out.println(name);
        }
       

    }}
