package com.teste.ArqHexagonal.adapters.outbound;

import com.teste.ArqHexagonal.domain.exceptions.EntidadeNaoEncontradaException;
import com.teste.ArqHexagonal.domain.exceptions.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalHandlerException {

    @ExceptionHandler(EntidadeNaoEncontradaException.class)
    public ResponseEntity<ErrorResponse> handlerEntidadeNaoEncontrada(
            EntidadeNaoEncontradaException e,
            HttpServletRequest request
    ) {
        ErrorResponse response = new ErrorResponse(
                404,
                "NOT FOUND",
                e.getMessage(),
                request.getRequestURI(),
                LocalDateTime.now()
        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
