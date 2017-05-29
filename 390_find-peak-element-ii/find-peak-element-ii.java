/*
@Copyright:LintCode
@Author:   vadxin
@Problem:  http://www.lintcode.com/problem/find-peak-element-ii
@Language: Java
@Datetime: 16-09-02 09:05
*/

class Solution {
    /**
     * @param A: An integer matrix
     * @return: The index of the peak
     */
    public List<Integer> findPeakII(int[][] A) {
        // write your code here
        List<Integer> res = new ArrayList<Integer>();
        int start = 1;
        int end = A.length - 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int col = find(A, mid);
            if (A[mid][col] < A[mid - 1][col]) {
                end = mid - 1;
            } else if (A[mid][col] < A[mid + 1][col]) {
                start = mid + 1;
            } else {
                res.add(mid);
                res.add(col);
                break;
            }
        }
        return res;
    }
    
    public int find(int[][] A, int row) {
        int col = 0;
        for (int i = 0; i < A[0].length; i++) {
            if (A[row][i] > A[row][col]) {
                col = i;
            }
        }
        return col;
    }
}
