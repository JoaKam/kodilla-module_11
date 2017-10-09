package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    final String taskName;
    final String whatToBuy;
    final double quantity;
    Boolean isTaskDone = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Shopping task " + taskName + " is being executed");
        System.out.println("Buying  " + quantity + whatToBuy);
        this.isTaskDone = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        return isTaskDone;
    }
}
