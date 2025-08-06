import java.util.Objects;
public class Book {
    private final String titleBook;//название книги
    private final Author nameAuthor;//автор
    private int yearOfTheBook;//год издания

    public Book(String titleBook, Author nameAuthor, int yearOfTheBook) {
        this.titleBook = titleBook;
        this.nameAuthor = nameAuthor;
        this.yearOfTheBook = yearOfTheBook;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public Author getNameAuthor() {
        return nameAuthor;
    }
    public int getYearOfTheBook() {
        return yearOfTheBook;

    }
    public String toString() {
        return "Книга - " + titleBook + ", автор -  " + nameAuthor + " год публикации " + yearOfTheBook;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return yearOfTheBook == book.yearOfTheBook &&
                Objects.equals(titleBook, book.titleBook) &&
                Objects.equals(nameAuthor, book.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, nameAuthor, yearOfTheBook);

    }
}



