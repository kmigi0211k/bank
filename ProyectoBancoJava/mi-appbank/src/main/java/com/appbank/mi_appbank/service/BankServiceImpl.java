package com.appbank.mi_appbank.service;

import java.util.ArrayList;
import java.util.List;

import com.appbank.mi_appbank.model.Account;
import com.appbank.mi_appbank.model.Customer;
import com.appbank.mi_appbank.service.strategies.InterestStrategy;

public class BankServiceImpl implements BankService {

    private List<Customer> customers;
    private List<Account> accounts;
    private InterestStrategy interestStrategy;//PENDIENTE DE CREAR

    public BankServiceImpl(InterestStrategy interestStrategy) {
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
        this.interestStrategy = interestStrategy;
    }

    //Implementacion del metodo crear cliente 
    @Override
    public Customer createCustomer(String id, String name, String email){
        Customer customer = new Customer(id, name, email);
        customers.add(customer);
        return customer;
    }

    //Implementacion del metodo buscar cliente por el id
    @Override
    public Customer findCustomerById(String customerId){
        return customers.stream()
        .filter(c -> c.getId().equals(customerId))
        .findFirst().orElse(null);
    }

    //implmenetacion del metodo obtener todos los clientes 
    @Override
    public List<Customer> getAllCustomers(){
        return customers;
    }



}
