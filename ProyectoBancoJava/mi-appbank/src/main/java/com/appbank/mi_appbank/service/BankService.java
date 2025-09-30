package com.appbank.mi_appbank.service;

import java.util.List;

import com.appbank.mi_appbank.model.Account;
import com.appbank.mi_appbank.model.Customer;
import com.appbank.mi_appbank.model.Transaction;

public interface BankService {
    //Gestion de clientes
    Customer createCustomer(String id, String name, String email);
    Customer findCustomerById(String customerId);
    List<Customer> getAllCustomers();

    //Gestion de cuentas
    Account createSavingsAccount(String accountId, Customer customer, double interestRate);
    Account createChekingAccount(String accountId, Customer customer, double overdraftLimit);
    Account findAccountById(String accountId);
    List<Account> getAllAccounts();

    //operaciones bancarias
    boolean deposit(String accountId, double amount);
    boolean withdraw(String accountId, double amount);
    boolean transfer(String fromAccountId, String toAccountId, double amount);

    //Intereses
    void applyInterest(String accountId);



    //Consultas
    List<Transaction> getAccountTransactions(String accountId);

    

}
