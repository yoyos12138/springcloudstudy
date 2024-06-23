package com.zzz.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zzz.Mapper.AccountMapper;
import com.zzz.Service.AccountService;
import com.zzz.entity.Account;

import jakarta.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService{
    @Resource
    AccountMapper accountMapper;

    @Override
    public List<Account> getAllAccounts() {
        return accountMapper.getAllAccounts();
    }
    
}
