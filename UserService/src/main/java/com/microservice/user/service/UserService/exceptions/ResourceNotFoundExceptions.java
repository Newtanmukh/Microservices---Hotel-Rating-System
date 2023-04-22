package com.microservice.user.service.UserService.exceptions;

public class ResourceNotFoundExceptions extends RuntimeException{

    public ResourceNotFoundExceptions(){
        super("Resource NOT Found on Server");
    }

    public ResourceNotFoundExceptions(String message){
        super(message);
    }

}
