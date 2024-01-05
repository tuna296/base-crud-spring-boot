package com.example.basecrudspringboot.repository;

import com.example.basecrudspringboot.dto.response.UserResponse;
import com.example.basecrudspringboot.entity.User;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends BaseRepository<User> {
  @Query(
        """
                select new com.example.basecrudspringboot.dto.response.UserResponse
                (u.id, u.username,u.password,u.email,u.phone,u.role)
                from User u
                where u.id=:id
              """
  )
  UserResponse getByUserId(Long id);
}

