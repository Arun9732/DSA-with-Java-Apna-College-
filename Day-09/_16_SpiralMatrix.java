public class _16_SpiralMatrix {

  public static void SpiralMatrix(int matrix[][]){
    int sr = 0, sc = 0;
    int er = matrix.length - 1;
    int ec = matrix[0].length - 1;

    while (sr <= er && sc <= ec) {
      // Top row
      for (int j = sc; j <= ec; j++) {
        System.out.print(matrix[sr][j] + " ");
      }

      // Right column
      for (int i = sr + 1; i <= er; i++) {
        System.out.print(matrix[i][ec] + " ");
      }

      // Bottom row
      if (sr < er) {
        for (int j = ec - 1; j >= sc; j--) {
          System.out.print(matrix[er][j] + " ");
        }
      }

      // Left column
      if (sc < ec) {
        for (int i = er - 1; i > sr; i--) {
          System.out.print(matrix[i][sc] + " ");
        }
      }

      sr++;
      sc++;
      er--;
      ec--;
    }
  }

  public static void main(String[] args) {
    int matrix[][] = {
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12},
      {13, 14, 15, 16}
    };
    SpiralMatrix(matrix);
  }
}