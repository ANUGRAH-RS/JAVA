import java.util.Scanner;
class Matrix
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter No Rows:");
 int m=sc.nextInt();
 System.out.println("Enter No Columns:"); 
 int n=sc.nextInt();
 int[][] mat1=new int[m][n];
 int[][] mat2=new int[m][n];
 int[][] summat=new int[m][n];
 System.out.println("Enter The First Matrix:");
 for(int i=0;i<m;i++)
 {
  for(int j=0;j<n;j++)
  mat1[i][j]=sc.nextInt();
 }
 System.out.println("Enter The Second Matrix:");
 for(int i=0;i<m;i++)
 {
  for(int j=0;j<n;j++)
  mat2[i][j]=sc.nextInt();
 } 

 //Adition
 System.out.println("The result is :");
 for(int i=0;i<m;i++)
 {
  for(int j=0;j<n;j++)
  {
   summat[i][j]=mat1[i][j]+mat2[i][j];
   System.out.print(summat[i][j]+"\t");
  }
  System.out.println();
 }
}
}
