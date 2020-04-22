import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> bookList = new ArrayList<Book>();
    
    boolean flag = true;
    
    while(flag) {

        System.out.print("Title: ");
        String title = scanner.nextLine();
        if(title.isEmpty()) {
            flag = false;
            break;
        } else {
            System.out.print("Pages: ");
            int page = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            bookList.add(new Book(title, page, publicationYear));
        }
    }
    
        System.out.println("What information will be printed? ");
        String answer = scanner.nextLine();
        
        if(answer.equals("everything")) {
            for(int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i).getTitle() + ", " + bookList.get(i).getPageNumber() + " pages, " + bookList.get(i).getPublicationYear());
            }
        }
        
        if(answer.equals("name")) {
          for(int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i).getTitle());
            }  
        }
        
    }
}
