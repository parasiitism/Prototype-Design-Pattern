public class BookstoreApp {
    
    public static void main(String[] args) {
      
        BookRegistry bookregistry = new BookRegistry();

        Educational educational = (Educational) bookregistry.getBook(BookType.EDUCATIONAL);
        System.out.println(educational);


        educational.setType("Undergraduate Books");
        System.out.println(educational);

        Educational educational2=(Educational)bookregistry.getBook(BookType.EDUCATIONAL);
        System.out.println(educational2);

    }
}