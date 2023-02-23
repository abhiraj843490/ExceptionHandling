package com.appsdeveloperblog.exceptionHandling.repo;

import com.appsdeveloperblog.exceptionHandling.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
