package com.example.basecrudspringboot.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ResponseGeneral<T> {
  private int status;
  private String message;
  private T data;

  public static <T> ResponseGeneral<T> of(int status, String message, T data) {
    return new ResponseGeneral<>(status, message, data);
  }

  public static <T> ResponseGeneral<T> ofSuccess(String message, T data) {
    return of(HttpStatus.OK.value(), message, data);
  }

  public static <T> ResponseGeneral<T> ofSuccess(String message) {
    return of(HttpStatus.OK.value(), message, null);
  }
}
