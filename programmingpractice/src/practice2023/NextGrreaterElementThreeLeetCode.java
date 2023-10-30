package programmingpractice.src.practice2023;

public class NextGrreaterElementThreeLeetCode {

    public int nextGreaterElement(int n) {

        char []str = (n + "").toCharArray();
        int point = str.length-1;

        while (point >0){
            if(str[point] > str[point-1]){
                break;
            }
            point--;
        }

        if(point == 0){
            return  -1;
        }

        int firstSwappingIndex = point-1;
        int secondSwappingIndex = str.length-1;

        while (firstSwappingIndex <= secondSwappingIndex){
            if(str[firstSwappingIndex] < str[secondSwappingIndex]){
                break;
            }
            secondSwappingIndex--;
        }
        char temp = str[firstSwappingIndex];
        str[firstSwappingIndex] = str[secondSwappingIndex];
        str[secondSwappingIndex] = temp;

        reverse(str , point);
        long result = Long.parseLong(new String(str));
        if(result > Integer.MAX_VALUE)
            return -1;

        return (int) result;
    }

    private void reverse(char[] str, int point) {
        int start = point;
        int end = str.length-1;
        while (start <= end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        NextGrreaterElementThreeLeetCode nextElement = new NextGrreaterElementThreeLeetCode();
        int n = 12;
       nextElement.nextGreaterElement(n);
    }
}
