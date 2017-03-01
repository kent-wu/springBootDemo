package com.kentwu.repository;

import com.kentwu.pojo.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, String> {
    User findByName(String name);
}
