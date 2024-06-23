package com.zzz.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzz.Service.BookService;
import com.zzz.entity.Book;

import jakarta.annotation.Resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RequestMapping("/api/book")
@RestController
public class BookController {
    @Resource
    BookService bookService;

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.getALlBooks();
    }
    
}
