package client;

import app.controller.BookController;
import app.domain.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app");
        BookController controller = context.getBean(BookController.class);
        Book book = controller.getByIndex(0);
        System.out.println(book);
    }
}
