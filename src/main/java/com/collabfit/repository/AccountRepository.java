package com.collabfit.repository;

import com.collabfit.domain.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by sumanth on 2/23/17.
 */
public interface AccountRepository extends MongoRepository<Account, String> {
    Account save(Account account);
}
