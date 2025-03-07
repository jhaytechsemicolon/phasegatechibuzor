import java.util.Scanner;
public class Average{
public static void main(String...args){

	Scanner input = new Scanner(System.in);
int totalScores = 0;
int averageScores = 0;
int enterScores = 0;
for(int count = 0; count<10; count++){

System.out.println("enter Score" + (count + 1));
 enterScores = input.nextInt();
if (enterScores % 2 == 0){
totalScores += enterScores;
averageScores = totalScores/2;
}
}
System.out.println("average score is: "totalScores/2);
 }
}