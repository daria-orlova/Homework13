public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");

        Book capitainsDaughter = new Book("Капитанская дочка", 1723, pushkin);
        Book warAndPeace = new Book("Война и мир", 1823, tolstoy);

        printInfo(capitainsDaughter);
        printInfo(warAndPeace);
        System.out.println(pushkin.equals(tolstoy));
    }
    public static void printInfo (Book book) {
        System.out.println(book.toString());
        System.out.println(book.hashCode());
    }
}