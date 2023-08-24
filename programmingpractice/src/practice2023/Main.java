package programmingpractice.src.practice2023;

import java.util.*;

public class Main {

    public static  void splitName(List<String> fullName){

//            Map<String,List<String>> map = new HashMap<>();
//            List<List<String>> list = new ArrayList<>();
//            for(String names : fullName){
//                String [] name = names.split(" ");
//                if(map.containsKey(name[1])){
//                  map.put(name[0] ,  map.get(name[0]).add(name[1]));
//
//                }
//            }
//
//        System.out.println(map);

        }


    public static void moveZeroesToLast(int [] array){
        int first = 0;
        int second = first+1;
        int temp =0;
        while(second < array.length-1){
            System.out.println(first+" "+ array[first]);
            System.out.println(second+" "+ array[second]);
            if(array[first] == 0 && array[second]!= 0){
                temp = array[first];
                array[first] = array[second];
                array[second] = temp;
                first++;
                second++;
            }if(array[second] == 0){
                second++;
            }if (array[first] !=0){
                first++;
            }
        }
        for (int i:array) {
            System.out.println(i);
        }
    }


    void m1(int i, long j){
        System.out.println("one");
    }
    void m1(long j, int i){
        System.out.println("two");
    }

//    public int mp(){
//
//        return 0;
//    }
//
//    public double mp(){
//        return 0.1;
//    }



    public static void main(String[] args) {

        Main main = new Main();
       // main.m1( 1,1);

int [] array ={14, 0, 34, 0, 0, 16, 22, 0, 56, 0, 17};
        moveZeroesToLast(array);

        splitName(Arrays.asList("Rohit Kholi" ,
                "Virat Kholi",
                "Varun Sharma",
                "Ajay Sharma",
                "SuryaKumay Yadav"));

    }
}
