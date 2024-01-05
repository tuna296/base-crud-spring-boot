package com.example.basecrudspringboot.exception;

import com.example.basecrudspringboot.exception.base.NotFoundException;

import static com.example.basecrudspringboot.constant.Constants.MessageCode.USER_NOT_FOUND;

public class UserNotFoundException extends NotFoundException {
  public UserNotFoundException(){
    setMessage(USER_NOT_FOUND);
  }
}
