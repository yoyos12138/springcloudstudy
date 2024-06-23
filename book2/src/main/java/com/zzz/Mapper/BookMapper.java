package com.zzz.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.zzz.entity.Book;

@Mapper
public interface BookMapper {
    @Select("select * from book_list")
    List<Book> getAllBooks();
}
