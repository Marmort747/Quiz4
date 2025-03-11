package prototypePattern;

public class Main {
    public static void main(String[] args) {


       Book book1 = new Book("Java", "John");

        System.out.println(book1);

       Book cloneBook1 = (Book) book1.clone();

       cloneBook1.setAuthor("Andrea");
       cloneBook1.setTitle("Php");

        System.out.println(cloneBook1);





    }
}
