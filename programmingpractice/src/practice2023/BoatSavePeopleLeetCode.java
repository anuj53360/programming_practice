package programmingpractice.src.practice2023;

public class BoatSavePeopleLeetCode {


    public int numRescueBoats(int[] people, int limit) {

    int left =0;
    int right = people.length-1;
    int count =0;


    while (left <= right){
        int sum= people[left] + people[right];
        if(sum <=limit){
        count += 1;
        left++;
        right--;
        }
        else if (people[left] >= limit){
            count +=1;
            left++;
        }else {
            count +=1;
            right--;
        }
    }
return count;
    }

    public static void main(String[] args) {
      int []people = {3,5,3,4};
      int limit = 5;
      BoatSavePeopleLeetCode bs = new BoatSavePeopleLeetCode();
    System.out.println(bs.numRescueBoats(people , limit));

    }
}
