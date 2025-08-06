import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Михаил", " Булгаков");
        Author secondAuthor = new Author("Лев", " Толстой");

        Book firstBook = new Book("Мастер и Маргарита", firstAuthor, 1967);
        Book secondBook = new Book("Война и мир", secondAuthor, 1867);
        Book secondBook1 = new Book("Война и мир", secondAuthor, 1866);

        System.out.println("Книга - " + firstBook.getTitleBook() + ", год публикации " + secondBook.getYearOfTheBook() + ", автор -  " + firstAuthor.getNameAuthor() + " " + firstAuthor.getAuthorSurname());
        System.out.println("Книга - " + secondBook.getTitleBook() + ", год публикации " + secondBook.getYearOfTheBook() + ", автор - " + secondAuthor.getNameAuthor() + " " + secondAuthor.getAuthorSurname());

        System.out.println(firstBook);
        System.out.println(secondBook);

        System.out.println(firstBook.equals(firstBook));
        System.out.println(secondBook.equals(secondBook1));

        System.out.println(firstBook.hashCode() + firstBook.hashCode());
        System.out.println(secondBook.hashCode() + secondBook.hashCode());





    }
}

