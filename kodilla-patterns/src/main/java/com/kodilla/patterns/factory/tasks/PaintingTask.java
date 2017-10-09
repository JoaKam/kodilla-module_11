package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    final String taskName;
    final String color;
    final String whatToPaint;
    Boolean isTaskDone = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting task " + taskName + " is being executed");
        System.out.println("Painting  " + whatToPaint + color);
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
