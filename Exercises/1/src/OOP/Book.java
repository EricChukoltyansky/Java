package OOP;

public class Book {
    public String title;
    public int numberOfPages;
    public double price;
    public String author;

    public String printDetails() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n";
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Harry Potter";
        book1.numberOfPages = 500;
        book1.price = 19.99;
        book1.author = "J.K. Rowling";
        System.out.println(book1.title);
        System.out.println(book1.numberOfPages);
        System.out.println(book1.price);
        System.out.println(book1.printDetails());
    }

}
