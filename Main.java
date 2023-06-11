package BookList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList=new ArrayList<>();
        bookList.add(new Book("the lord of the rings",900,"J.R.R Tolkien", LocalDate.of(1954,7,29)));
        bookList.add(new Book("Duma island",600,"Stephen King", LocalDate.of(2007,5,9)));
        bookList.add(new Book("yarının adamı",300,"con sinow", LocalDate.of(2023,6,10)));
        bookList.add(new Book("Zincire vurulmuş promethius",240,"Eshilos", LocalDate.of(1200,1,1)));
        bookList.add(new Book("Animal Farm",260,"George Orwell", LocalDate.of(1979,4,15)));
        bookList.add(new Book("Master and Margarite",480,"Mihael BulGakov", LocalDate.of(1987,12,8)));
        bookList.add(new Book("Elveda Güzel Vatanım",380,"Ahmet Ümit", LocalDate.of(2018,2,12)));
        bookList.add(new Book("Diplomasi",870,"Henry Kissinger", LocalDate.of(1978,3,17)));
        bookList.add(new Book("Gece Uçuşu",230,"Antoine De SaintExupery", LocalDate.of(1996,2,10)));
        bookList.add(new Book("Hükümdar",180,"Niccolo Machiavelli", LocalDate.of(1870,1,8)));


        List<Book> bigList;
        //books which are pageNumber >=100
        bigList=bookList.stream().filter(book->book.getPageNumber()>=100).toList();
        bigList.forEach(book -> System.out.println(book.getName()+" "+book.getAuthor()+" "+book.getPageNumber()+" "+book.getPublishDate() ));

        Map<String, String> newBookList=new TreeMap<>();
        bookList.forEach(book -> newBookList.put(book.getName(),book.getAuthor()));

        newBookList.forEach((name,author)-> System.out.println("Kitap adı: "+ name + " Yazar: "+ author));
    }
}
