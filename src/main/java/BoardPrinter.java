
public class BoardPrinter {

    static int[][] board = new int[9][9];

    public static void main(String[] args) {
      //  List<String> board = new ArrayList<>();

        printEmtpySudoku();
        board[1][1] = 5;
        printSudokuWithNumber();
    }

    private static void printEmtpySudoku() {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                System.out.print("_ ");
                if (column == 2 || column == 5) System.out.print("* ");
            }
            System.out.println();
            if (row == 2 || row == 5) {
                System.out.println("*********************");
            }
        }
        System.out.println();
    }

    private static void printSudokuWithNumber() {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (board[row][column] == 0)
                {
                    System.out.print("_ ");
                } else {
                    System.out.print(board[row][column] + " ");
                }
                if (column == 2 || column == 5) System.out.print("* ");
            }
            System.out.println();
            if (row == 2 || row == 5) {
                System.out.println("*********************");
            }
        }
    }

}
