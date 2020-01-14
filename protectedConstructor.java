class Book {
  int bookID;
  String BookName;

  protected Book(int id, String name) {
    bookID = id;
    BookName = name;
  }
}
public class Main{
  public static void main(String[] args) {
    Book book = new Book(21, "english");
    System.out.println(book.bookID + " " + book.BookName);
  }
}