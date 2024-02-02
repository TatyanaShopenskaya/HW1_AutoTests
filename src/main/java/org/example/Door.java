package org.example;

public class Door {
    int id;
    boolean surprizeTrue;    //за дверью выигрыш - да/нет

    public Door(int id, boolean surprizeTrue) {
        this.id = id;
        this.surprizeTrue = surprizeTrue;
    }

    public boolean surprize(){
        return surprizeTrue;
    }
}
