package com.example.basecrudspringboot.service;

import com.example.basecrudspringboot.dto.request.UserRequest;
import com.example.basecrudspringboot.dto.response.PageResponse;
import com.example.basecrudspringboot.dto.response.UserResponse;

public interface UserService {
  UserResponse getById(Long id);
  UserResponse create(UserRequest request);
  void delete(Long id);
  PageResponse<UserResponse> list (String keyword, int size, int page, boolean isAll);
}
