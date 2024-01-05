package com.example.basecrudspringboot.exception.base;

import static com.example.basecrudspringboot.constant.Constants.MessageCode.NOT_FOUND;

public class NotFoundException extends BaseException {
  public NotFoundException() {
    setMessage(NOT_FOUND);
    setStatus(StatusConstants.NOT_FOUND);
  }
}