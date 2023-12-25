package DesignPatterns.Command.Example4;

import DesignPatterns.Command.Example4.FX.AddCustomerCommand;
import DesignPatterns.Command.Example4.FX.Button;
import DesignPatterns.Command.Example4.FX.Command;

public class ServiceDemo {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Command command = new AddCustomerCommand(service);

        Button button = new Button(command);
        button.click();

//        CustomerService service2 = new CustomerService();
//        Command command2 = new AddCustomerCommand(service2);
//
//        command2.execute();

    }
}
