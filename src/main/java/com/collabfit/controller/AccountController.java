package com.collabfit.controller;

import com.collabfit.domain.Account;
import com.collabfit.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by sumanth on 2/23/17.
 */
@RestController
public class AccountController {
    private final AccountService accountService;

    @Autowired
    AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(path = "/account/create", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccount(@RequestBody @Valid Account account) {
        System.out.println(account.getEmail());
        return accountService.create(account);
    }
}
