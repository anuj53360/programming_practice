package programmingpractice.src.practice2023;

import java.util.Arrays;

public class ThreeSumMultiplicityLeetCode {

    public int threeSumMulti(int[] arr, int target) {

        int count =0;
        Arrays.sort(arr);
        for (int i=0;i<arr.length-2;i++) {

            int sum = target - arr[i];
            int left = i+1;
            int right = arr.length-1;
            while (left < right){
                if(arr[left] + arr[right] < sum){
                    left++;
                }else if (arr[left] + arr[right] > sum){
                    right--;
                }else {
                    int count1 =1;
                    int count2 = 1;
                    if(arr[left] == arr[right]){
                        int len = right-left+1;
                        count += (len*(len-1)/2);
                        break;
                    }
                    while (left < right && arr[left] == arr[left+1]){
                        count1++;
                        left++;
                    }
                    while (right > left && arr[right] == arr[right-1]){
                        count2++;
                        right--;
                    }
                    count += (count1*count2);
                    left++;
                    right--;
                }
            }
        }

return (int) (count %1000000007);
    }

    public static void main(String[] args) {
ThreeSumMultiplicityLeetCode threeSumMultiplicityLeetCode = new ThreeSumMultiplicityLeetCode();
       int []arr = {1,1,2,2,3,3,4,4,5,5};
       int target = 8;
      System.out.println(threeSumMultiplicityLeetCode.threeSumMulti(arr , target));

    }
}
