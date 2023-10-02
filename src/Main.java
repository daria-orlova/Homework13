public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");

        Book capitainsDaughter = new Book("Капитанская дочка", 1723, pushkin);
        Book warAndPeace = new Book("Война и мир", 1823, tolstoy);

        System.out.println(
                capitainsDaughter.getTitle() + " " + capitainsDaughter.getPublishingYear() + " " +
                        capitainsDaughter.getAuthor().getName() + " " +
                        capitainsDaughter.getAuthor().getSurname()
        );

        System.out.println(
                warAndPeace.getTitle() + " " + warAndPeace.getPublishingYear() + " " +
                        warAndPeace.getAuthor().getName() + " " +
                        warAndPeace.getAuthor().getSurname()
        );
    }
}