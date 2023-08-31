import java.util.Arrays;

public class exArray {
public static void main(String[] args) {
int [] marks= new int[5];
marks[0]=100;
marks[1]=90;
marks[2]=80;
marks[3]=50;
marks[4]=30;

System.out.println("Array 2 ma ko cha"+" "+marks[2]);
//length
System.out.println("kati thari marks"+" "+marks.length);
//sort -> asscending oder 
Arrays.sort( marks);
System.out.println("Asscending oder ma rakda "+" "+marks[0]);

}
}