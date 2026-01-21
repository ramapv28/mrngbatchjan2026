import java.util.Scanner;
class sum{

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number");
        int size =scan.nextInt();
        int[] b=new int[size];//assigning int array for the size
        for(int i=0;i<size;i++){
            System.out.println("Enter the value of "+i);
            b[i]=scan.nextInt();
        }
        int total=0;
        for (int i=0;i<size;i++){
            total=total+b[i];
        }
        System.out.println("The total value is "+total);
    }
}