package com.prueba.tecnica.clima.client.config.error;

import com.prueba.tecnica.clima.exception.NotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ApiErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {

        switch (response.status()){
            case 400:
                return new Exception("Bad Request");
            case 404:
                return new NotFoundException();
            default:
                return new Exception("Generic error");
        }
    }
}
