package com.example.basecrudspringboot.exception.base;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StatusConstants {

  public static final Integer NOT_FOUND = 404;
  public static final Integer BAD_REQUEST = 400;
}