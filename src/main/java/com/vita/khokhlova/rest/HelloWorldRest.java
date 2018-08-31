package com.vita.khokhlova.rest;

import com.vita.khokhlova.JPA.*;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/")
public class HelloWorldRest {

    private BookRepository bookRepository = new BookRepository();
    private PublisherRepository publisherRepository = new PublisherRepository();
    private AuthorRepository authorRepository = new AuthorRepository();

    @GET
    @Path("helloworld")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return "Ca marche!";
    }

    @GET
    @Path("helloworld/{s}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello(@PathParam("s") String s) {
        return "Hello "+s;
    }

//    @GET
//    @Path("book")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Book> getAllBooks(){
//       return bookRepository.getAll();
//    }



    @GET
    @Path("book/id")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBookById(@QueryParam("fId") String id){
        return bookRepository.getById(Integer.parseInt(id));
    }

    @GET
    @Path("book/title")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBookByTitle(@QueryParam("fTitle") String title){
        return bookRepository.getByTitle(title);
    }

//
//
//    @GET
//    @Path("book/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Book getBook(@PathParam("id") int id) {
//        return bookRepository.getById(id);
//    }

    @GET
    @Path("author/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Author getAuthor(@PathParam("id") int id) {
        return authorRepository.getById(id);
    }

    @DELETE
    @Path("book/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteBook(@PathParam("id") int id) {
        Response response;
        Book book = bookRepository.getById(id);
        if(book == null) {
            response = Response.ok("entity with id=" + id + " does not exist").build();
        }
        else{
            bookRepository.deleteBook(id);
            response = Response.ok("entity " + book + " is deleted").build();
        }

        return response;
    }

    @POST
    @Path("book")
    @Consumes(MediaType.APPLICATION_JSON)
    public Book createBookByPost(Book book) {
        bookRepository.createBook(book);
        return book;
    }

    @PUT
    @Path("book")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateBookByPut(Book book) {
        Book bexists = bookRepository.getById(book.getId());
        String s = bexists.toString();
        if (bexists == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        bookRepository.updateBook(book);
        return Response.ok("book " + s + " is updated to " + book).build();
    }

    @GET
    @Path("publisher")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Publisher> getAllPublishers(){
        return publisherRepository.getAll();
    }

    @GET
    @Path("publisher/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Publisher getPublisher(@PathParam("id") int id) {
        return publisherRepository.getPublisherById(id);
    }


    @GET
    @Path("publisher/name/{publishername}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Publisher> getPublisherByName(@PathParam("publishername") String publishername){
        return publisherRepository.getPublisherByName(publishername);
    }



}
