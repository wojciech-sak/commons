package com.kodilla.commons;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountUpdate {
    private String senderAccount;
    private String recipientAccount;
    private BigDecimal amount;
}
