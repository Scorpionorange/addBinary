/**
 * Created by ScorpionOrange on 2016/10/07.
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 样例:
 * a = 11, b = 1;
 * 返回 100;
 *
 * @param a a number
 * @param b a number
 * @return the result
 */
public class Solution {
    public String addBinary(String a, String b) {
        // Write your code here
        // 方法一：转换为十进制再计算，然后转换二进制返回；
        /*
        int m = Integer.parseInt(a, 2);
        int n = Integer.parseInt(b, 2);
        return Integer.toBinaryString(m + n);
        */
        // 方法一的简略版本：无需定义新的变量；
        //return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));

        // 方法二：使用自定义的进制转换方法（目前仅支持int转换为String）
        return new Solution().hexadecimal(Integer.parseInt(a, 2) + Integer.parseInt(b, 2), 2);
    }

    public String hexadecimal(int m, int n){
        int remainder ;
        String output = "";

        while ( m >= n ){
            remainder = m % n;
            m = m / n;
            output = remainder + output;
        }
        output = m + output;

        return output;
    }
}
