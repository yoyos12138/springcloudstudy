package com.zzz.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.zzz.entity.Account;

@Mapper
public interface AccountMapper {
    @Select("select * from account_list")
    List<Account> getAllAccounts();
}
