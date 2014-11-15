package behavioral.iterator;


import java.util.List;

public class BookIterator {
    private int position = 0;
    private BooksCollection booksCollection;

    public BookIterator(BooksCollection $booksCollection) {
        this.booksCollection = $booksCollection;
    }

    public boolean hasNext() {
        if (this.position < this.booksCollection.getTitles().size()) {
            return true;
        }
        return false;
    }

    public String next() {
        List<String> titles = this.booksCollection.getTitles();
        if (this.hasNext()) {
            return titles.get(this.position++);
        } else {
            return null;
        }
    }
}
