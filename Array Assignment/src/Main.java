import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[0]; //Create an empty array
        boolean check = true;//give a check variable to check when to quit
        while (check) {
            System.out.println("Current integer array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }//print the array by iterations
            System.out.println("\n**********************\n1. Add value to the end \n2. Delete value from the end \n3. Insert value at index \n4. Quit");//give the instructions
            System.out.print("Enter your choice: ");
            int userchoice = scanner.nextInt();//ask for an input

            if (userchoice == 1) {//method to add a variable to the array
                System.out.print("Enter the value to add: ");//ask for the variable
                int value = scanner.nextInt();
                array = add(array, value);//use the method add
            } else if (userchoice == 2) {
                array = delete(array); //use the method delete
            } else if (userchoice == 3) {
                System.out.print("Enter the value to insert: ");
                int value = scanner.nextInt();//ask for value to insert
                System.out.print("Enter the index to insert at: ");
                int index = scanner.nextInt();//ask for index for the variable the user wish to insert
                array = insert(array, value, index);//use the method insert
            } else if (userchoice == 4) {
                System.out.println("Quitting Program.");//to let the user be able to quit the program
                check = false;

            } else {
                System.out.println("Invalid choice. Please enter again.");//tell the user to enter again if invalid input
            }
        }
    }
    //add
    public static int[] add(int[] array, int value) {
        int length = 0;
        for(int i :array){
            length += 1;
        }
        //get the length of the array
        int[] newarray =  new int[length+1];//create a new array with one more slot

        int index = 0;
        for (int i : array){
            newarray[index] = i;
            index++;
        }
        //copy the array except for the last
        newarray[index] = value;
        //copy the last variable
        return newarray;//return the new array
    }
    //delete
    public static int[] delete(int[] array) {
        int length = 0;
        for(int i :array){
            length += 1;
        }
        //get the length of the array
        if (length == 0) {
            System.out.println("Array is empty, Please try again. ");
            return array;//check if the array is empty and return the original array
        }
        int[] newarray = new int[length - 1];//create a new array with one less variable
        for (int i =0; i  < length -1; i++){
            newarray[i] = array[i];//copy the array
        }
        return newarray;//return the array
    }
    //insert
    public static int[] insert(int[] array, int value, int index) {
        int length = 0;
        for(int i :array){
            length += 1;
        }//get the length of array
        if (index < 0 || index > length) {
            System.out.println("Invalid index.");
            return array;
        }//check if the index is possible

        int[] newarray = new int[length + 1]; // Create a new array with one more slot

        int j = 0;
        for (int i = 0; i < length+1 ; i++) {
            if (i == index) {
                newarray[i] = value; // Insert the value at the specified index
            } else {
                newarray[i] = array[j];//copy the rest of the array
                j+= 1;
            }
        }
        return newarray;//return the new array


    }
}
