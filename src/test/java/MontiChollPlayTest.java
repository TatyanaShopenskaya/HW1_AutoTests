import org.example.*;


import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MontiChollPlayTest {

        List<Door> doors;
        @BeforeEach
        void addDoorsToList () {
            doors = new ArrayList<>();
            doors.add(new Door(1,true));
            doors.add(new Door(2,false));
            doors.add(new Door(3,false));
        }

        @Test
        void falseChangeChoiseTrueTest () {
            User user = new User("Игрок", false);
            MontiChollPlay play = new MontiChollPlay(user, doors);

            Door door = play.newMontiChollPlay(0);

            Assertions.assertTrue(door.surprize());
        }

        @Test
        void falseChangeChoiseFalseTest() {
            User user = new User("Игрок", false);
            MontiChollPlay play = new MontiChollPlay(user, doors);

            Door door = play.newMontiChollPlay(1);

            Assertions.assertFalse(door.surprize());
        }

        @Test
        void trueChangeChoiseTrueTest () {
            User user = new User("Игрок", true);
            MontiChollPlay play = new MontiChollPlay(user, doors);

            Door door = play.newMontiChollPlay(1);

            Assertions.assertTrue(door.surprize());
        }

        @Test
        void trueChangeChoiseFalseTest () {
            User user = new User("Игрок", true);
            MontiChollPlay play = new MontiChollPlay(user, doors);

            Door door = play.newMontiChollPlay(0);

            Assertions.assertFalse(door.surprize());
        }
    }
