/*
@Copyright:LintCode
@Author:   vadxin
@Problem:  http://www.lintcode.com/problem/scramble-string
@Language: Java
@Datetime: 16-07-17 07:53
*/

public class Solution {
    /**
     * @param s1 A string
     * @param s2 Another string
     * @return whether s2 is a scrambled string of s1
     */
    public boolean isScramble(String s1, String s2) {
        // Write your code here
        if (s1.length() != s2.length()) {
            return false;
        }
        
        if (s1.length() == 0 || s1.equals(s2)) {
            return true;
        }
        
        if (!isValid(s1, s2)) {
            return false;
        }
        for (int i = 1; i < s1.length(); i++) {
            String s11 = s1.substring(0, i);
            String s12 = s1.substring(i, s1.length());
            String s21 = s2.substring(0, i);
            String s22 = s2.substring(i, s2.length());
            String s23 = s2.substring(0, s2.length() - i);
            String s24 = s2.substring(s2.length() - i, s2.length());
            if (isScramble(s11, s21) && isScramble(s12, s22)) {
                return true;
            }
            if (isScramble(s11, s24) && isScramble(s12, s23)) {
                return true;
            }
        }
        return false;
    }
    public boolean isValid(String s1, String s2) {
        char[] s1char = s1.toCharArray();
        char[] s2char = s2.toCharArray();
        Arrays.sort(s1char);
        Arrays.sort(s2char);
        if (!new String(s1char).equals(new String (s2char))) {
            return false;
        }
        return true;
    }
    
    
    
// 记忆化搜索
//     private boolean checkScramble(String s1,int start1, String s2, int start2, int k, int [][][]visit) {
// 		if(visit[start1][start2][k] == 1)
//             return true;
//         if(visit[start1][start2][k] ==-1)
//             return false;
        
        
//         if (s1.length() != s2.length()) {
//             visit[start1][start2][k] = -1;
//             return false;
//         }
        
//         if (s1.length() == 0 || s1.equals(s2)) {
//             visit[start1][start2][k] = 1;
//             return true;
//         }
        
//         if (!isValid(s1, s2)) {
//             visit[start1][start2][k] = -1;
//             return false;
//         }// Base Cases
        
        
//         for (int i = 1; i < s1.length(); i++) {
//             String s11 = s1.substring(0, i);
//             String s12 = s1.substring(i, s1.length());
            
//             String s21 = s2.substring(0, i);
//             String s22 = s2.substring(i, s2.length());
            
//             String s23 = s2.substring(0, s2.length() - i);
//             String s24 = s2.substring(s2.length() - i, s2.length());
            
//             if (checkScramble(s11,start1, s21, start2, i, visit) && checkScramble(s12, start1+i, s22, start2+i,k-i, visit))  {
//                 visit[start1][start2][k] = 1;
//                 return true;
//             }
            
//             if (checkScramble(s11,start1, s24, start2+k-i, i, visit) && checkScramble(s12,start1+i, s23,start2, k-i, visit))
//             {
//                 visit[start1][start2][k] = 1;
//                 return true;
//             }
//         }
//         visit[start1][start2][k] = -1;
//         return false;
//     }
//     public boolean isScramble(String s1, String s2) {
//         int len = s1.length();
//         int [][][] visit = new int[len][len][len + 1];
//         return checkScramble(s1,0,s2,0, len, visit);
//     }
    
    
//     private boolean isValid(String s1, String s2) {
//         char[] arr1 = s1.toCharArray();
//         char[] arr2 = s2.toCharArray();
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         if (!(new String(arr1)).equals(new String(arr2))) {
//             return false;
//         }
//         return true;
//     }
}