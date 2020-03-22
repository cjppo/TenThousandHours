package com.cjppo.backend.war.domain.presist.impl;

import com.cjppo.backend.war.dao.UserDao;
import com.cjppo.backend.war.dao.model.UserEntity;
import com.cjppo.backend.war.domain.User;
import com.cjppo.backend.war.domain.presist.IDataReposity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component("MongoDataReposityImpl")
public class MongoDataReposityImpl implements IDataReposity {

    @Autowired
    @Qualifier("modelmapper")
    private ModelMapper mapper;

    @Autowired
    private UserDao userDao;

    @Override
    public boolean saveOrUpdate(User user) {
        if (user == null) {
            return false;
        }

        UserEntity user_db_entity = mapper.map(user, UserEntity.class);
        if (user_db_entity != null) {
            return userDao.save(user_db_entity) != null;
        }else {
            return false;
        }
    }

    @Override
    public User findByUserName(String userName) {
        if (!StringUtils.isEmpty(userName)) {
            UserEntity user_from_db = userDao.findByUser(userName);
            if (user_from_db == null) {
                return null;
            }else {
                return mapper.map(user_from_db, User.class);
            }
        }else {
            return null;
        }
    }
}
