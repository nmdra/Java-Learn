package DesignPatterns.Template.Example3;

import DesignPatterns.Template.Example3.Template.Task;
import DesignPatterns.Template.Example3.Template.TransferMoneyTask;

public class Demo {
    public static void main(String[] args) {
        Task task = new TransferMoneyTask();
        task.execute();
    }
}
