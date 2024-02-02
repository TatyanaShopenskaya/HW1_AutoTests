package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListOfDoors {
    public static List<Door> getDoors() {
        List<Door> doors = new ArrayList<>();
        doors.add(new Door(1,true));
        doors.add(new Door(2,false));
        doors.add(new Door(3,false));
        Collections.shuffle(doors);     //перемешиваем
        return doors;

    }

}
