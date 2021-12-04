package com.company.Printable;

public class Todo implements Printable{
    //Todo that has three fields representing the task as a string, the priority as string and whether it is done or not as a boolean

    private String task;
    private String priority;
    private boolean isDone;

    public Todo (String task, String priority, boolean isDone){
        this.task = task;
        this.priority = priority;
        this.isDone = isDone;
    }

    @Override
    public void printAllFields() {
        System.out.println("Task: " + task +  " | Priority: " + priority + " | Done: " + isDone);
    }
}
