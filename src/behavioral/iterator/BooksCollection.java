package behavioral.iterator;


import java.util.ArrayList;
import java.util.List;

public class BooksCollection {

    private List<String> titles = new ArrayList<String>();

    public List<String> getTitles() {
        return titles;
    }

    public void setTitle(String title) {
        this.titles.add(title);
    }

    public BookIterator createIterator() {
        return new BookIterator(this);
    }
}
