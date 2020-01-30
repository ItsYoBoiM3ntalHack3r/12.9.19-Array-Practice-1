//Take 10 integer inputs from a user and store them in an array and print them on screen.
import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
  int inputs[] = new int[10];
  Scanner input = new Scanner(System.in);
  System.out.println("Input 10 integers");
  for(int i = 0; i<10; i++){
    inputs[i] = input.nextInt();
  }
  System.out.print(Arrays.toString(inputs));
  }
}