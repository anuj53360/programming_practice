package programmingpractice.src.practice2023;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSequenceOfArray {

    public void printAllSubSequenceInArray(int []arr , int n){
        List<List<Integer>> list = new ArrayList<>();

        printAllSubSequenceInArrayUtil(0 , arr , list , new ArrayList<Integer>() , n);

    }

    private void printAllSubSequenceInArrayUtil(int index, int[] arr, List<List<Integer>> list , ArrayList<Integer> tempList, int n) {

    if(index == arr.length){
        tempList.forEach(System.out::print);
        System.out.println();
    }else{
        tempList.add(arr[index]);
        printAllSubSequenceInArrayUtil(index+1 , arr , list , tempList , n) ;
        tempList.remove(tempList.size()-1);
        printAllSubSequenceInArrayUtil(index+1 , arr , list ,tempList , n);

    }






    }

    public static void main(String[] args) {
        PrintAllSubSequenceOfArray ps = new PrintAllSubSequenceOfArray();
        int []arr = {1,2,3};
        int n =3;
        ps.printAllSubSequenceInArray(arr , n);
    }
}
