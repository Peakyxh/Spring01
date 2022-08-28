package edu.cqnu;

import edu.cqnu.service.impl.BookServiceImpl;

public class App1 {
    public static void main(String[] args) {
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.save();
    }
}
