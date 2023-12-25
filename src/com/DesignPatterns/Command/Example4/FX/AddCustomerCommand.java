package DesignPatterns.Command.Example4.FX;

import DesignPatterns.Command.Example4.CustomerService;

public class AddCustomerCommand implements Command {
    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}