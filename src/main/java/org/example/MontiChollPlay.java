package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для реализации игры
 */
public class MontiChollPlay {

    User user;
    List<Door> doors = new ArrayList<Door>();

    public MontiChollPlay(User user, List<Door> doors) {
        this.user = user;
        this.doors = doors;
    }

    public Door newMontiChollPlay(int door) {
        if (!user.changeDoor()) return doors.get(door);   //не меняет выбор
        else {
            doors.remove(doors.get(door));                //меняет выбор
            return doors.get(0).surprize() ? doors.get(0) : doors.get(1);    //замена
        }
    }
}

