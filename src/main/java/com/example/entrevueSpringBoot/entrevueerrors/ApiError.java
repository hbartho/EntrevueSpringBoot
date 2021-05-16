package com.example.entrevueSpringBoot.entrevueerrors;

public class ApiError {
      String exception;

      public ApiError() {
      }

      public void setException(String exception) {
            this.exception = exception;
      }

      public String getException() {
            return exception;
      }
}