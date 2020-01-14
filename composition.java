class Book {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Library {
    private Book book;
    public Library()
    {
        this.book=new Book();
        book.setName("xyz");
    }
    public String getName() {
        return book.getName();
    }

}
public class Main {

    public static void main(String[] args) {
        Library library=new Library();
        String name = library.getName();
        System.out.println(name);
    }

}
