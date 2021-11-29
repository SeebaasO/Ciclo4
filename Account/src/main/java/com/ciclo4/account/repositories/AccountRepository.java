package com.ciclo4.account.repositories;

import com.ciclo4.account.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository <Account, String> { }