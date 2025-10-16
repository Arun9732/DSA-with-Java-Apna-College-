class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int sr = 0;
        int er = n - 1;
        int sc = 0;
        int ec = n - 1;
        // Pehle Transpose
        for (int i = sr; i <= er; i++) {
            for (int j = i + 1; j <= ec; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // then fir Each Row Reverse
        for (int i = sr; i <= er; i++) {
            int left = sc;
            int right = ec;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}