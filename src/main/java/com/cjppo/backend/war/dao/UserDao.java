package com.cjppo.backend.war.dao;

import com.cjppo.backend.war.dao.model.UserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author: jie_cao
 * @create: 2019-01-14 20:04
 **/
public interface UserDao extends PagingAndSortingRepository<UserEntity, String> {
    UserEntity findByUser(String user);
    @Override
    UserEntity save(UserEntity s);
}
