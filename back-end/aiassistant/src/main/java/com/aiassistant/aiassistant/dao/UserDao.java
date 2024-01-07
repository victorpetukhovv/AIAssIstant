package com.aiassistant.aiassistant.dao;

import com.aiassistant.aiassistant.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, String> {

}
