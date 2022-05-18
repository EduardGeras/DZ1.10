import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author(String surname, String name) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return surname.equals(c2.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname);
    }

    @Override
    public String toString() {
        return surname + " " + name;
    }
}
