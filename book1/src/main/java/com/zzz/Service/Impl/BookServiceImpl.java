package com.zzz.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zzz.Mapper.BookMapper;
import com.zzz.Service.BookService;
import com.zzz.entity.Book;

import jakarta.annotation.Resource;

@Service
public class BookServiceImpl implements BookService{
    @Resource
    BookMapper bookMapper;

    @Override
    public List<Book> getALlBooks() {
        return bookMapper.getAllBooks();
    }
}
