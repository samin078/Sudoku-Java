
package Sudoku;

import Main.DBConnection;



public class Sudoku {
    static int[] mat[];
    static int[] full[];
    static int[] prev[];
    int N; // number of columns/rows.
    int SRN; // square root of N
    int K; // No. Of missing digits
 
    DBConnection conn;
    
    
    // Constructor
    Sudoku(int N, int K) 
    {
        this.N = N;
        this.K = K;
 
        // Compute square root of N
        Double SRNd = Math.sqrt(N);
        SRN = SRNd.intValue();
 
        mat = new int[N][N];
        full = new int[N][N];
        prev = new int[N][N];
        
        
    }
 
    // Sudoku Generator
    public void fillValues()
    {
        // Fill the diagonal of SRN x SRN matrices
        fillDiagonal();
 
        // Fill remaining blocks
        fillRemaining(0, SRN);
 
        
        saveValues();
        // Remove Randomly K digits to make game
        removeKDigits();
        savePrev();
        
    }
    
    
    void saveValues()
    {
        for (int i = 0; i<N; i++)
        {
            for (int j = 0; j<N; j++)
                full[i][j]=mat[i][j];
                
        }
    }
    
    void savePrev()
    {
        for (int i = 0; i<N; i++)
        {
            for (int j = 0; j<N; j++)
                prev[i][j]=mat[i][j];
                
        }
    }
    
    void check(int k){
        int count = 0;
        for (int i = 0; i<N; i++)
        {
            for (int j = 0; j<N; j++){
                if(full[i][j]==0)
                count++;
            }     
        }
        if(count!=0){
            System.out.println(count);
            mat = new int[N][N];
            full = new int[N][N];
            fillValues();
        }
    }
    
 
    // Fill the diagonal SRN number of SRN x SRN matrices
    void fillDiagonal()
    {
 
        for (int i = 0; i<N; i=i+SRN)
 
            // for diagonal box, start coordinates->i==j
            fillBox(i, i);
    }
 
    // Returns false if given 3 x 3 block contains num.
    boolean unUsedInBox(int rowStart, int colStart, int num)
    {
        for (int i = 0; i<SRN; i++)
            for (int j = 0; j<SRN; j++)
                if (mat[rowStart+i][colStart+j]==num)
                    return false;
 
        return true;
    }
 
    // Fill a 3 x 3 matrix.
    void fillBox(int row,int col)
    {
        int num;
        for (int i=0; i<SRN; i++)
        {
            for (int j=0; j<SRN; j++)
            {
                do
                {
                    num = randomGenerator(N);
                }
                while (!unUsedInBox(row, col, num));
 
                mat[row+i][col+j] = num;
            }
        }
    }
 
    // Random generator
    int randomGenerator(int num)
    {
        return (int) Math.floor((Math.random()*num+1));
    }
 
    // Check if safe to put in cell
    boolean CheckIfSafe(int i,int j,int num)
    {
        return (unUsedInRow(i, num) &&
                unUsedInCol(j, num) &&
                unUsedInBox(i-i%SRN, j-j%SRN, num));
    }
 
    // check in the row for existence
    boolean unUsedInRow(int i,int num)
    {
        for (int j = 0; j<N; j++)
           if (mat[i][j] == num)
                return false;
        return true;
    }
 
    // check in the row for existence
    boolean unUsedInCol(int j,int num)
    {
        for (int i = 0; i<N; i++)
            if (mat[i][j] == num)
                return false;
        return true;
    }
 
    // A recursive function to fill remaining
    // matrix
    boolean fillRemaining(int i, int j)
    {
        //  System.out.println(i+" "+j);
        if (j>=N && i<N-1)
        {
            i = i + 1;
            j = 0;
        }
        if (i>=N && j>=N)
            return true;
 
        if (i < SRN)
        {
            if (j < SRN)
                j = SRN;
        }
        else if (i < N-SRN)
        {
            if (j==(int)(i/SRN)*SRN)
                j =  j + SRN;
        }
        else
        {
            if (j == N-SRN)
            {
                i = i + 1;
                j = 0;
                if (i>=N)
                    return true;
            }
        }
 
        for (int num = 1; num<=N; num++)
        {
            if (CheckIfSafe(i, j, num))
            {
                mat[i][j] = num;
                if (fillRemaining(i, j+1))
                    return true;
 
                mat[i][j] = 0;
            }
        }
        return false;
    }
 
    // Remove the K no. of digits to
    // complete game
    public void removeKDigits()
    {
        int count = K;
        int i,j;
        if(N==4 && K==8){
            i=0;j=0;
            
            count--;
            mat[i][j] = 0;
            i=3;j=3;
            count--;
            mat[i][j] = 0;
            i=2;j=1;
            count--;
            mat[i][j] = 0;
            count--;
            mat[j][i] = 0;
            i=3;j=0;
            count--;
            mat[i][j] = 0;
            count--;
            mat[j][i] = 0;
            
            i=1;j=0;
            count--;
            mat[i][j] = 0;
            count--;
            mat[j][i] = 0;
            
            
            
        }
        else {
            while (count >= 0)
            {
                int cellId = randomGenerator(N*N)-1;

                // System.out.println(cellId);
                // extract coordinates i  and j
                i = (cellId/N);
                j = cellId%N;
                if (j != 0)
                    j = j - 1;

                 //System.out.println(i+" "+j);
                if (mat[i][j] != 0 && mat[j][i] != 0)
                {
                    count--;
                    mat[i][j] = 0;
                    count--;
                    mat[j][i] = 0;
                    System.out.println(i+" "+j);
                }
            }
        }
        check(K);
    }
 
    
    
    
    // Print Sudoku
    public void printSudoku()
    {
        for (int i = 0; i<N; i++)
        {
            for (int j = 0; j<N; j++)
                System.out.print(prev[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }
    
    
    /*
    // Driver code
    public static void main(String[] args)
    {
        int N = 9, K = 20;
        Sudoku Sudoku = new Sudoku(N, K);
        Sudoku.fillValues();
        Sudoku.printSudoku();
    }
*/
}