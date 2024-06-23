package com.zzz.Service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.zzz.entity.Book;

@FeignClient("book")
public interface BookClient {
    @GetMapping("/api/book/all")
    public List<Book> getAllBooks();
}
