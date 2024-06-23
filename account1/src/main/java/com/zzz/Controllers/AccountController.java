package com.zzz.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzz.Service.AccountService;
import com.zzz.entity.Account;

import jakarta.annotation.Resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RequestMapping("/api/account")
@RestController
public class AccountController {

    @Resource
    AccountService accountService;

    @GetMapping("/all")
    public List<Account> getAllAccounts() {
        System.out.println("1");
        return accountService.getAllAccounts();
    }
    
}
