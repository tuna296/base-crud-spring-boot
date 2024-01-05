package com.example.basecrudspringboot.exception.base;

import static com.example.basecrudspringboot.constant.Constants.MessageCode.BAD_REQUEST;

public class BadRequestException extends BaseException {
  public BadRequestException() {
    setMessage(BAD_REQUEST);
    setStatus(StatusConstants.BAD_REQUEST);
  }
}