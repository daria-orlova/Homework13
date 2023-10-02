import java.util.Objects;

public class Author {
    public String name;
    public String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        return name + " " + surname;
    }
    public int hashCode() {
        return Objects.hash(name, surname);
    }
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Author author = (Author) o;
        return author.name.equals(name) && author.surname.equals(surname);
    }
}
