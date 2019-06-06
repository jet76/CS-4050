import java.util.*;
public class dna
{    
    static void optimize(String gene1, String gene2) {
        int match = 0; // penalty for match
        int mismatch = 1; // penalty for a mismatch
        int gap = 2; // penalty for any horizontal or vertical shift
        int gene1Length = gene1.length(); // columns
        int gene2Length = gene2.length(); // rows
        int matrix[][] = new int[gene2Length + 1][gene1Length + 1];
        matrix[gene2Length][gene1Length] = 0;
        for(int col = gene1Length - 1; col >= 0; col--) {
            matrix[gene2Length][col] = matrix[gene2Length][col + 1] + 2;
        }
        for(int row = gene2Length - 1; row >= 0; row--) {
            matrix[row][gene1Length] = matrix[row + 1][gene1Length] + 2;
        }
        System.out.println();
        // fill matrix
        for(int row = gene2Length - 1; row >= 0; row--) {
            for(int col = gene1Length - 1; col >= 0; col--) {
                int penalty = mismatch;
                if(gene2.charAt(row) == gene1.charAt(col)) {
                    penalty = match;
                }
                matrix[row][col] = Math.min(matrix[row + 1][col + 1] + penalty, Math.min(matrix[row + 1][col] + gap, matrix[row][col + 1] + gap));
            }
        }
        
        // find optimal sequence
        String sequence1 = "";
        String sequence2 = "";
        int i = 0;
        int j = 0;
        while(!(i == gene2Length || j == gene1Length)) {
            if(gene2.charAt(i) == gene1.charAt(j)) {
                sequence1 += gene1.charAt(j);
                sequence2 += gene2.charAt(i);
                i++;
                j++;
            }            
            else if(matrix[i + 1][j] + gap == matrix[i][j]) {
                sequence1 += "-";
                sequence2 += gene2.charAt(i);
                i++;
            }
            else if(matrix[i][j + 1] + gap == matrix[i][j]) {
                //System.out.println(i + " : " + j + " : " + matrix[i][j + 1] + gap + " : " + matrix[i][j]);
                sequence1 += gene1.charAt(j);
                sequence2 += "-";
                j++;
            }
            else if(matrix[i + 1][j + 1] + mismatch == matrix[i][j]) {
                sequence1 += gene1.charAt(j);
                sequence2 += gene2.charAt(i);
                i++;
                j++;
            }
        }
        // display the chart
        System.out.print(String.format("%-4s", ""));
        for(int col = 0; col < gene1Length; col++)
            System.out.print(String.format("%-4s", gene1.charAt(col)));
        System.out.print(String.format("%-4s", "-"));
        System.out.println();
        for(int row = 0; row <= gene2Length; row++) {
            if(!(row == gene2Length)) {
                System.out.print(String.format("%-4s", gene2.charAt(row)));
            }
            else {
                System.out.print(String.format("%-4s", "-"));
            }
            for(int col = 0; col <= gene1Length; col++) {
                System.out.print(String.format("%-4s", matrix[row][col]));
            }
            System.out.println();
        }
        System.out.println("Best score = " + matrix[0][0]);
        System.out.println("Best sequence: ");
        System.out.println(sequence1);
        System.out.println(sequence2);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter sequence 1: ");
        String gene1 = scan.nextLine();
        System.out.print("Enter sequence 2: ");
        String gene2 = scan.nextLine();
        optimize(gene1, gene2);
    }
}
