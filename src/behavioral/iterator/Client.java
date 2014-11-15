package behavioral.iterator;


public class Client {
    /*
    The idea of the iterator pattern is to take the responsibility of accessing
    and passing trough the objects of the collection and put it in the iterator object.
    The iterator object will maintain the state of the iteration, keeping track of the
    current item and having a way of identifying what elements are next to be iterated.
    */
    public static void main(String [] args) {
        BooksCollection booksCollection = new BooksCollection();

        booksCollection.setTitle("Design Patterns");
        booksCollection.setTitle("Clean Code");
        booksCollection.setTitle("Refactoring");
        booksCollection.setTitle("JQuery");

        BookIterator bookIterator = booksCollection.createIterator();
        while (bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }
    }
}
