package edu.cqnu;

import edu.cqnu.dao.BookDao;
import edu.cqnu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //3.获取Ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean
        /*BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();*/

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
        System.out.println("12");

        System.out.println("pull test");
    }
}
