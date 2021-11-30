package br.com.cursoudemy.productapi.modules.produto.exception

import br.com.cursoudemy.productapi.modules.produto.controller.response.ErrorResponse
import br.com.cursoudemy.productapi.modules.produto.controller.response.FieldErrorResponse
import br.com.cursoudemy.productapi.modules.produto.enums.Errors
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest

@ControllerAdvice
class ControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleMethodArgumentNotValidException(ex: MethodArgumentNotValidException, request: WebRequest): ResponseEntity<ErrorResponse> {
        val erro = ErrorResponse(
            HttpStatus.BAD_REQUEST.value(),
            Errors.ML001.message,
            Errors.ML001.code,
            ex.bindingResult.fieldErrors.map { FieldErrorResponse(it.defaultMessage ?: "invalid", it.field) }
        )

        return ResponseEntity(erro, HttpStatus.BAD_REQUEST)
    }
}