package DSA.ARRAYS;

public class spiralMatrix {

    public static void printSpiral(int arr[][]) {

        int startRow = 0;
        int startColumn = 0;
        int endRow = arr.length - 1;
        int endColumn = arr[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {

            // top

            for (int j = startRow; j <= endColumn; j++) {
                System.out.print(arr[startColumn][j] + " ");
            }

            //right
            for (int j=startRow+1;j<=endRow;j++){
                System.out.print(arr[j][endColumn]+" ");
            }

            //bottom
            for (int j=endColumn-1;j>=startColumn;j--){
                System.out.print(arr[endRow][j]+" ");

            }
            //left

            for (int j=endRow-1;j>=startRow+1;j--){
                System.out.print(arr[j][startColumn]+" ");
            }

            startRow ++;
            startColumn ++;
            endRow--;
            endColumn --;

        }

    }

    public static void main(String[] args) {

        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };
        printSpiral(arr);

    }

}
