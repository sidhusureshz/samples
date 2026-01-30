import java.util.Scanner;

public class MatrixOperations{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

System.out.println("---Enter Dimensions for the Matrix A---");
System.out.print("rows:  ");
int r1=sc.nextInt();

System.out.print("cols:  ");
int c1=sc.nextInt();

System.out.println("---Enter Dimensions for the Matrix B---");
System.out.print("rows:  ");
int r2=sc.nextInt();

System.out.print("cols:  ");
int c2=sc.nextInt();

int [][] A=int[r1][c1];
int [][] B=int[r2][c2];

System.out.println("Enter the elements for Matrix A:");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
A[i][j]=sc.nextInt();
}

}
System.out.println("Enter the elements for Matrix B:");
for(int i=0;i<r2;i++){
for(int j=0;j<c2;j++){
B[i][j]=sc.nextInt();
}
}
while(true){
System.out.println("\n----Menu---");
System.out.println("1.Addition");
System.out.println("2.Multiplication");
System.out.println("3.Exit");
System.out.println("Enter Choice:");

int choice=sc.nextInt();

if(choice==3)break;

switch(choice){
case 1:if(r1==r2 && c1==c2){
System.out.println("Sum Matrix:");

case 2:if(r1==r2 && c1==c2){
System.out.println("Product Matrix:");

















