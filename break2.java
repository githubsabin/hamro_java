public class break2 {
         public static void main(String[]args){
                  int i =2;
                  while (true)
                  {
                           if (i==4)
                           {
                                    i=i+1;
                                    continue;
                           }
                           System.out.println(i);
                           i++;
                           if(i>5)
                           break;
                  }
         }
         
}
