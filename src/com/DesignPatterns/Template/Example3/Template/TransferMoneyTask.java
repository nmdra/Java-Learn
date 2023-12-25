package DesignPatterns.Template.Example3.Template;

import DesignPatterns.Template.Example3.Template.Task;

public class TransferMoneyTask extends Task {
  @Override
  protected void doExecute() {
    System.out.println("Transfer Money");
  }
}
