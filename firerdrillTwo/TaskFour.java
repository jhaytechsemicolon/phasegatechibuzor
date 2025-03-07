import java.util.Scanner;
public class TaskFour{
public static void main(String...args){

	Scanner input = new Scanner(System.in);
int sumIndex = 0;

int enterScores = 0;
for(int count = 0; count<10; count++){

System.out.println("enter Score" + (count + 1));
 enterScores = input.nextInt();
if (count % 2 == 0){
sumIndex += count;

}
}
System.out.println("sum of index: " + sumIndex);

 }
}