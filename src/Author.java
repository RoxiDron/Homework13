import java.util.Objects;
public class Author {
    private String nameAuthor;
    private String authorSurName;

    public Author(String nameAuthor, String authorSurName) {
        this.nameAuthor = nameAuthor;
        this.authorSurName = authorSurName;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getAuthorSurname() {
        return authorSurName;
    }


    public String toString() {
        return nameAuthor + " " + authorSurName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Author author = (Author) obj;
        return Objects.equals(nameAuthor, author.nameAuthor) &&
                Objects.equals(authorSurName, author.authorSurName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, authorSurName);
    }
}





