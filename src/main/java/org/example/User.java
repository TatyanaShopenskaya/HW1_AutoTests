package org.example;

import java.util.List;

public class User {
    String name;
    boolean changeChoice;      //пользователь меняет свой первоначальный выбор - да/нет

    public User(String name, boolean changeChoice) {
        this.name = name;
        this.changeChoice = changeChoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean changeDoor() {
        return changeChoice;
    }

    public void setChange(boolean change) {
        this.changeChoice = changeChoice;
    }
}
