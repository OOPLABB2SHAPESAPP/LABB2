package model;

import java.time.LocalDate;

public class Project {
    private String title;
    private int id;
    private LocalDate created;
    private int nextTaskId;
    private String descr;

    Project(String title, String descr, int id){
        this.title=title;
        this.descr=descr;
        this.id=id;
        this.created=LocalDate.now();
    }

    public Task getTaskById(int id){
        return id;
    }

    public Task addTask(String descr, Prio prio){

    }
}
