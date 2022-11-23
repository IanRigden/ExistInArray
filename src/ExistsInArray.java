import java.util.Scanner;
public class ExistsInArray {
    public static void main(String[] args) {
        //The array to search
        int[] myArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        //Ask the user for an integer to search for
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter an integer to search for : ");
        int searchFor = reader.nextInt();

        //Loop through the array searching for a match
        Boolean Found = false; //A flag to see if it has been found
        for(int i : myArray){
            if(i == searchFor){
                Found = true;
                break; //Exit the loop as found
            }
        }

        //Was it found or not?
        if(Found){
            System.out.println("Value " + searchFor + " found in array!");
        } else {
            System.out.println("Value was not found in array.");
        }
    }
}
