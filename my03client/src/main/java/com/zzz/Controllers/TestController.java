package com.zzz.Controllers;

import org.springframework.web.bind.annotation.RestController;
import com.zzz.Service.client.BookClient;
import com.zzz.entity.Book;

import jakarta.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class TestController {

    @Resource
    BookClient bookClient;

    @GetMapping("/")
    public String test2() {
        return "你好";
    }
    

    @GetMapping("/1")
    public String test1() {
        var ss=bookClient.getAllBooks();
        var sb=new StringBuilder();
        for (Book book0 : ss) {
            sb.append(book0.toString());
        }
        return sb.toString();
    }
    
}
