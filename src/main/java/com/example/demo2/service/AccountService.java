package com.example.demo2.service;

import com.example.demo2.dto.AccountDto;
import com.example.demo2.model.Account;
import com.example.demo2.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AccountService {

    @Autowired
    IAccountRepository repository;

    public void saveOrUpdate(Account account){
        repository.save(account);
    }

    public List<Account> showAll(){
        return repository.findAll();
    }

    public void delete(Account account){
        repository.delete(account);
    }
}
