import java.util.Scanner;
public class TaskTwo{
public static void main(String...args){

	Scanner input = new Scanner(System.in);
int totalScores = 0;
int averageScores = 0;
int enterScores = 0;
for(int count = 0; count<10; count++){

System.out.println("enter Score" + (count + 1));
 enterScores = input.nextInt();
totalScores += enterScores;
averageScores = totalScores/2;
}

System.out.println(averageScores);
 }
}