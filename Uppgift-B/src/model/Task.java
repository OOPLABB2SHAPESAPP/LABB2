package model;

import java.time.LocalDate;

public class Task {
    private String description;
    private int id;
    private String takenBy;
    private TaskState state;
    private LocalDate lastUpdated;
    private Prio prio;

    Task(String description, Prio prio, int id) {
        this.description = description;
        this.prio=prio;
        this.id=id;
        this.state = TaskState.TO_DO;
        this.lastUpdated = LocalDate.now();
        this.takenBy= "";
    }


    public void setTakenBy(String takenBy) {
        this.takenBy = takenBy;
        this.lastUpdated=LocalDate.now();
    }

    public void setState(TaskState state) {
        this.state = state;
        this.lastUpdated=LocalDate.now()
    }

    public void setPrio(Prio prio) {
        this.prio = prio;
        this.lastUpdated=LocalDate.now()
    }

   public int compareTo(Task other){
    //tolkar det som att den ska vara ärvd för att project har också en
   }
}
