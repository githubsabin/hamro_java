import java.util.Scanner;
class pratice{
         public static void main(String[]args){
                 Scanner sc= new Scanner(System.in);
                  System.out.println("enter your number");
                int Cash=sc.nextInt();

                 
                  if (  Cash > 100  ){
                  System.out.println(" here is your book and pen ");
         }
                  else if (Cash==100 ){
                  System.out.println("here is your pen only");
                  }
                  else{
                  System.out.println("not enough cash");
         }}
}