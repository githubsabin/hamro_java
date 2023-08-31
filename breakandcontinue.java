public class breakandcontinue{
public static void main(String[]args){
         int i =1;//declare

         while(true) // condition
         {
                  if(i==3){
                           i=i+1;
                           continue;
                  }
                  
                  System.out.println(i);
                  i++; //increment
                  if ( i>5){
                           break;
                  }
                  

         }   

}
}