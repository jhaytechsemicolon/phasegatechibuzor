import java.util.Scanner;
public class TaskThree{
public static void main(String...args){

	Scanner input = new Scanner(System.in);
int totalScores = 0;
int averageScores = 0;
int enterScores = 0;
for(int count = 0; count<10; count++){
 if (enterScores % 2 == 0){
System.out.println("enter Score" + (count + 1));
 enterScores = input.nextInt();


totalScores += enterScores;

}


}
System.out.println("sum is: " + totalScores);
System.out.println("average is: " + totalScores/2);


 }
}