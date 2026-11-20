package consumerFunctionalInterface;
/*In a library management system, users need to be notified if any of the books they have borrowed are due today.

Requirement:
Write a Java program that:

Defines a Book class with title, user, and dueToday fields

Uses a Consumer<Book> to send a notification message

Filters only those books where dueToday == true

Uses .accept() to process and print the notifications

Class and Method Structure:
Class: Book

Attributes:
String title
String user
boolean dueToday

Constructor:
Book(String title, String user, boolean dueToday)

Hint:
- Define a Consumer<Book> like:
Consumer<Book> notify = b ->
System.out.println("Notify " + b.user + ": Please return '" + b.title + "' today.");

- Use a loop:
for (Book b : books) {
if (b.dueToday) {
notify.accept(b);
}
}*/
import java.util.function.Consumer;
public class BooksDueDate {
    public static void main(String[] args) {
        int count = 0;
       int noOfInputs = Integer.parseInt(IO.readln().trim());
       Book books[] = new Book[noOfInputs];
       for(int i = 0; i < noOfInputs; i++){
        String title = IO.readln().trim();
        String user = IO.readln().trim();
        boolean dueToday = Boolean.parseBoolean(IO.readln().trim());
        if(dueToday)
        count++;
        books[i] = new Book(title, user, dueToday);
       }

       Consumer<Book> c = b ->{
        System.out.println("Notify " + b.user() + ": Please return '" + b.title() + "' today.");
       };

        if(count != 0){
       for(Book book : books){
            if(book.dueToday()){
                c.accept(book);
            }
       }
        }else{
            IO.println("no books due today");
        }
        
    }
}

record Book(String title, String user, boolean dueToday){}

