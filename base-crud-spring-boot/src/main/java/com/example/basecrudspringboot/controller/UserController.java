package com.example.basecrudspringboot.controller;

import com.example.basecrudspringboot.dto.response.ResponseGeneral;
import com.example.basecrudspringboot.dto.response.UserResponse;
import com.example.basecrudspringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.basecrudspringboot.constant.Constants.MessageCode.GET_USER_BY_ID;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("api/v1//users")
public class UserController {
  private final UserService userService;

  @GetMapping("/{id}")
  public ResponseGeneral<UserResponse> getById(@PathVariable Long id) {
    return ResponseGeneral.ofSuccess(GET_USER_BY_ID, userService.getById(id));
  }

}
