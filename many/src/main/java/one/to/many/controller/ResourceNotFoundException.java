package one.to.many.controller;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
 
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{
 
    private static final long serialVersionUID = 1L;
 
    public ResourceNotFoundException(String message){
        super(message);
    }
}