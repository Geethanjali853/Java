import java.util.Scanner;

public class Toggle {
    
    public static void main(String[] args) {
        
        //Create a Scanner object to take user input
        Scanner var1 = new Scanner(System.in);

        //Ask the user to enter a String
        System.out.println("Enter a String: ");

        //Read String input from the user
        String var2 = var1.nextLine();

        //Close the scanner as it's no longer needed
        var1.close();

        //Create a StringBuilder to build the toggled string
        StringBuilder var3 = new StringBuilder();

        //Convert the input string into an array of characters
        char[] var4 =var2.toCharArray();

        //Get the inputs of the array
        int var5 = var4.length;

        //Loop through each character of the input string
        for(int var6 = 0; var6 < var5; ++var6){
            //Get the current character from array
            char var7 = var4[var6];

            //if the character is uppercase, convert it to lowercase and append to the result
            if(Character.isUpperCase(var7)) {
                var3.append(Character.toLowerCase(var7));
            }
            //if the character is lowercase, conert it to uppercase
            else if (Character.isLowerCase(var7)) {
                var3.append(Character.toUpperCase(var7));
            }
            //if the character is neither(like a space or punctuation),just append it unchanged
            else {
                var3.append(var7);
            }
        }

        //Print the toggle string (uppercase to lowercase and vice versa)
        System.out.println("toggled string: " + String.valueOf(var3));
    }
}
