package com.jorge.credits.service;

import java.math.BigDecimal;

public interface OperationService {
    Flux<TransactionResponse> getTransactionsByCreditId(String id);

    Mono<CreditResponse> payCreditById(String id, BigDecimal amount);
    Mono<CreditResponse> payCreditCardByCreditCardNumber(String creditCardNumber, BigDecimal amount);
    Mono<CreditResponse> consumeCreditCardByCreditCardNumber(String creditCardNumber, BigDecimal amount);


}
