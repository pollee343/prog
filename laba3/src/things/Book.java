package things;

public class Book {
    private String name;
    private String author;
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
