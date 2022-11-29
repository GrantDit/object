
public class Main {

    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Author author1 = new Author("Иван", "Иванов");
        Author author2 = new Author("Петр", "Петров");
        Author author3 = new Author("Иван", "Петров");
        Book book = new Book("Война и Мир", author, 1925);
        Book book1 = new Book("Война", author1, 1250);
        Book book2 = new Book("Мир", author2, 1234);
        Book book3 = new Book("Пир", author3, 1540);
        System.out.println(author.getFirstName() + " " + author.getLastName() + " - '" + book.getBookName() + " " + "'" + "," + book.getPublicationYear());
        System.out.println(author1.getFirstName() + " " + author1.getLastName() + " - '" + book1.getBookName() + " " + "'" + ", " + book1.getPublicationYear());
        System.out.println(author2.getFirstName() + " " + author2.getLastName() + " - '" + book2.getBookName() + " " + "'" + "," + book2.getPublicationYear());
        System.out.println(author3.getFirstName() + " " + author3.getLastName() + " - '" + book3.getBookName() + " " + "'" + "," + book3.getPublicationYear());
        book2.setPublicationYear(2000);
        System.out.println(author2.getFirstName() + " " + author2.getLastName() + " - '" + book2.getBookName() + " " + "'" + "," + book2.getPublicationYear());
    }
}