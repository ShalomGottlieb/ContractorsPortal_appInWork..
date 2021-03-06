package ContractorsPortal.ContractorsPortal.Advice;

import ContractorsPortal.ContractorsPortal.Exceptions.AlreadyExistsException;
import ContractorsPortal.ContractorsPortal.Exceptions.IllegalRequestException;
import ContractorsPortal.ContractorsPortal.Exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ControllerAdvice
public class ServiceExceptions {

    @ExceptionHandler(value = {AlreadyExistsException.class})
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorDetail handleAlreadyExistsException(Exception e) {
        return new ErrorDetail("Already Exists error" , e.getMessage());
    }

    @ExceptionHandler(value = {IllegalRequestException.class})
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorDetail handleIllegalRequestException(Exception e) {
        return new ErrorDetail("Illegal Request error", e.getMessage());
    }

    @ExceptionHandler(value = {NotFoundException.class})
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorDetail handleNotFoundException(Exception e) {
        return new ErrorDetail("Not Found error", e.getMessage());
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED)
    public ErrorDetail generalException(Exception err){
        return new ErrorDetail("Error in send","An error has occurred ,with you forgiveness\n"+ err.getMessage());
    }


}


