import java.util.Arrays;

public class BookService {

    public Book[] filterBooksByAuthor(Author author, Book[] books) {
        return Arrays.stream(books)
                .filter(book -> book.isAuthorExisting(books, author))
                .toArray(Book[]::new);
    }

    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
        return Arrays.stream(books)
                .filter(book -> book.getPublisher() == publisher)
                .toArray(Book[]::new);


    }

    // methods keeps books with publishing year inclusively.
    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        return Arrays.stream(books)
                .filter(book -> book.getPublishingYear() == yearFromInclusively)
                .toArray(Book[]::new);
    }

}
