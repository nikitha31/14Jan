class Book {
  int bookID;
  String BookName;

  protected Book(int id, String name) {
    bookID = id;
    BookName = name;
  }
}
class BookName extends Book{
    BookName(int id,String name){
        super(id,name);
    }
    
}
public class Main{
  public static void main(String[] args) {
    BookName book = new BookName(21, "english");
    System.out.println(book.bookID + " " + book.BookName);
  }
}
