package com.example.springboottransactional.exception;

public class InsufficientAmountException  extends RuntimeException{
    public InsufficientAmountException(String msg){
        super(msg);
    }

}
