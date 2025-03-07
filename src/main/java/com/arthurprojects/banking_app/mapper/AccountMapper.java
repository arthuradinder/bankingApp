package com.arthurprojects.banking_app.mapper;

import com.arthurprojects.banking_app.dto.AccountDto;
import com.arthurprojects.banking_app.entity.Account;
import lombok.Data;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto){
        //converting AccountDto to account
        Account account = new Account();
        account.setAccountName(accountDto.getAccountName());
        account.setBalance(accountDto.getBalance());
        account.setId(accountDto.getId());
        return account;
    }
    //converting Account Jpa entity to dto
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountName(account.getAccountName());
        accountDto.setBalance(accountDto.getBalance());
        accountDto.setId(accountDto.getId());
        return accountDto;
    }

}
