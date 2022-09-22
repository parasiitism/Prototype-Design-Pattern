public abstract class Book implements Cloneable{
    private String bookCategory;
    private int price;

    public String getBookCategory() {
        return bookCategory;
    }
    public void setBookCategory(String bookCategory) {
        this.bookCategory=bookCategory;
    }
    public int getPrice() {
        return price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();    // It goes to superclass clone methd.
    }
}