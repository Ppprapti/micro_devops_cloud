package com.substring.blogapp.exception;

public class ResourceNotFoundException  extends  RuntimeException
{
    public ResourceNotFoundException(String message)
    {
        super(message);
    }

    public ResourceNotFoundException(){
        super("Resource Not Found");
    }
}
