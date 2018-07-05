package com.formation.start.csv;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class BookRepository extends ImportTable {

   ArrayList<Book> bookList = new ArrayList<>();


    public void fill() {
        for (ArrayList<String> s : getMatrix()) {
            Integer id = Integer.valueOf(s.get(0));
            String title = s.get(1);
            Double price = Double.valueOf(s.get(2));
            Integer nPage = Integer.valueOf(s.get(3));
            Publisher publisher = new Publisher(s.get(4));
            Book book = new Book(title, price, publisher, null, nPage);
            book.setId(id);
            bookList.add(book);
        }
    }

    public List<Book> getAll() {
        return bookList;
    }

    public Book getById(int id) {
        Book book = new Book();

        //prof
        book = bookList
                .stream()
                .filter(b -> b.getId() == id)
                .collect(Collectors.toList()).get(0);

        //moi
        /*for(Book b : bookList){
            if (b.getId() == id){
                book = b;
                break;
            }
        }*/
        return book;
    }

    public List<Book> getByTitle(String title) {

        List<Book> bookByTitle = new ArrayList<>();
        //prof
        bookByTitle = bookList
                .stream()
                .filter(b -> b.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
        //moi
        /*for(Book b : bookList){
            String bookTitle = b.getTitle().toLowerCase();
            if (bookTitle.contains(title.toLowerCase())){
                bookByTitle.add(b);
            }
        }*/
        return bookByTitle;
    }

    public List<Book> getByPrice(double price) {
        List<Book> bookByPrice = new ArrayList<>();
        //prof
        bookByPrice = bookList
                .stream()
                .filter(b -> b.getPrice() <= price)
                .collect(Collectors.toList());
        //moi
        /*for(Book b : bookList){
            if (b.getPrice() <= price){
                bookByPrice.add(b);
            }
        }*/
        return bookByPrice;
    }

    public List<Book> getByPublisher(String publisherName) {
        List<Book> bookByPublisher = new ArrayList<>();
        //prof
        bookByPublisher = bookList
                .stream()
                .filter(b -> b.getPublisher().getName().equals(publisherName))
                .collect(Collectors.toList());
        //moi
        /*for(Book b : bookList){
            if (b.getPublisher().getName().equals(publisherName)){
                bookByPublisher.add(b);
            }
        }*/
        return bookByPublisher;
    }

    public void add(Book b) {
        bookList.add(new Book(b.getTitle(), b.getPrice(), b.getPublisher(), b.getAuthorList(), b.getNbpage() ));
    }

    public void remove(Book b) {
        bookList.remove(b);
    }

    public void update(Book b) {
        for(Book c : bookList){
            if(c.getId() == b.getId()){
                c.setNbpage(b.getNbpage());
                c.setPublisher(b.getPublisher());
                c.setPrice(b.getPrice());
                c.setTitle(b.getTitle());
                c.setAuthorList(b.getAuthorList());
            }
        }
    }


    public void print(){
        for(Book b : bookList){
            System.out.println(b);
        }
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "bookList=" + bookList +
                '}';
    }
}
