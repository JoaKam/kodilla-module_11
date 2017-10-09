package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    final String taskName;
    final String where;
    final String using;
    Boolean isTaskDone = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Driving task " + taskName + " is being executed");
        System.out.println("Driving to  " + where + " by " + using);
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