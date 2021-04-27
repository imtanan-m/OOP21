package l8assign1_runner;

import java.util.Scanner;

public class L8Assign1_Runner {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //displaying title
        System.out.print("Enter book title: ");
        String title = input.nextLine();
        
        //displaying price
        System.out.print("Enter price: ");
        int price = input.nextInt();
        
        //displaying pages
        System.out.print("Enter number of pages: ");
        int pageCount = input.nextInt();
        
        //displaying playing time
        System.out.print("Enter playing time in minutes: ");
        int playingTime = input.nextInt();
        
        //displaying book
        System.out.print("\nBook: ");
        Book b = new Book(title, price, pageCount);
        b.display();
        
        //displaying tape
        System.out.print("\nTape: ");
        Tape t = new Tape(title, price, playingTime);
        t.display();
    }
    
}