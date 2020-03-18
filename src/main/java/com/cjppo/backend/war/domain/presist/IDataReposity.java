package com.cjppo.backend.war.domain.presist;

import com.cjppo.backend.war.domain.User;

/**
 * @author: jie_cao
 * @create: 2020-03-16 17:32
 **/
public interface IDataReposity {

    public boolean saveOrUpdate(User user);
    public User findByUserName(String userName);
}
