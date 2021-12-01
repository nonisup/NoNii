package com.bebePorte.repository;

import com.bebePorte.document.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {

}