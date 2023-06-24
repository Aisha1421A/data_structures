/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */عائشه الزهراني 
*/
package homework;

import static homework.Cipher.decode;
import static homework.Cipher.encode;
import java.util.Scanner;


public class HOMEWORK {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0;
        while (x != 5) {
            System.out.println("|||||||||MENU||||||||| \n1-Encrypt Text"
                    + "\n2-Decrypt Text"
                    + "\n3-Merge two sorted list in decreasing order"
                    + "\n4- Reverse Linked List Recursively "
                    + "\n5- Exit ");
            System.out.println("Please enter your choice: ");
            x = input.nextInt();
            input.nextLine();
            switch (x) {
                case 1:
                    System.out.println("Please enter Line to encode: ");
                    String plaintext = input.nextLine();
                    System.out.println("Please enter Shift  Number:");
                    int number = input.nextInt();
                    input.nextLine();

                    String encoded = encode(plaintext, number);
                    System.out.println("Result:");
                    System.out.println(encoded);
                    break;
                case 2:
                    System.out.println("Please enter Line to decode: ");
                    String code = input.nextLine();
                    System.out.println("Please enter Shift  Number:");
                    int number1 = input.nextInt();
                    input.nextLine();

                    System.out.println("Result:");
                    System.out.println(decode(code, number1));
                    break;
                case 3:
                    Merge list1 = new Merge();
                    Merge list2 = new Merge();
                    System.out.println("Enter first scentence :");
                    String[] string1 = input.nextLine().split(" ");

                    System.out.println("Enter second scentence :");
                    String[] string2 = input.nextLine().split(" ");
                    for (int i = 0; i < string1.length; i++) {
                        list1.insert(string1[i]);
                    }
                    for (int i = 0; i < string2.length; i++) {
                        list2.insert(string2[i]);
                    }
                    Merge merged = list1.merge(list1, list2);

                    System.out.println("Result ");
                    merged.Display();
                    System.out.println();
                    break;

                case 4:
                    SinglyLinkedList LL = new SinglyLinkedList();
                    System.out.println("Enter  scentence to reverse :");
                    String[] string = input.nextLine().split(" ");

                    for (int i = 0; i < string.length; i++) {
                        LL.addLast(string[i]);
                    }

                    System.out.println("REVERSED");
                    System.out.println(LL.reverse());
                    break;
                case 5:
                default:
                    System.out.println(" Goodbye ");

            }
        }
    }

}
