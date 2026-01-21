import java.util.Scanner;


class fibonacci{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number length for displaying fibonacci series");
        int num=scan.nextInt();
        System.out.println("maximum number to print for fibonacci series is :"+num);
        int first=0, second=1;

        for (int i=1;i<=num;i++){
            System.out.print(first + " ");

            int next=first+second;// swap logic =first+ second
            first=second;
            second=next;

        }

    }
}