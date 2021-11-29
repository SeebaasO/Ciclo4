package com.ciclo4.account.controllers;

import com.ciclo4.account.exceptions.AccountNotFoundException;
import com.ciclo4.account.repositories.AccountRepository;
import com.ciclo4.account.models.Account;
import org.springframework.web.bind.annotation.*;


@RestController
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @GetMapping("/accounts/{username}")
    Account getAccount (@PathVariable String username){
        return accountRepository.findById(username).orElseThrow(() -> new AccountNotFoundException ("No se encuentra registrado el paciente "));
    }

    @PostMapping("/accounts")
    Account newAccount(@RequestBody Account account){
        return accountRepository.save(account);
    }
}
