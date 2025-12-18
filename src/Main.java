import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        svistulkin s = new svistulkin("Свистулькин", sex.Male, 38, "policeman", eyes_color.Hazel, hair_color.Brown);

        vertibutylkin v = new vertibutylkin("Вертибутылкин", sex.Male, 45, "builder", eyes_color.Blue, hair_color.Gray);

        flatmates f1 = new flatmates("Анатолий", sex.Male, 21, "student", eyes_color.Green, hair_color.Black);

        flatmates f2 = new flatmates("Ирина", sex.Female, 19, "student", eyes_color.Blue, hair_color.Blonde);

        ArrayList<flatmates> flatmatesList = new ArrayList<>();
        flatmatesList.add(f1);
        flatmatesList.add(f2);

        ArrayList<directions> entranceList = new ArrayList<>();

        door_status door = new door_status(true);

        house h = new house();

        elevator e = new elevator();

        furniture furn = new furniture();

        alien_flat alien = new alien_flat();

        System.out.println("День начинается...");
        v.building();
        h.description();
        h.set_direction();
        entranceList.add(h.current_direction);
        h.direction();
        s.coming_home();
        h.set_direction();
        entranceList.add(h.current_direction);
        h.direction();

        try {
            h.checkEntrance(3); // подъезд 4
            System.out.println("подъезд правильный");
        } catch (WrongEntranceException ex) {
            System.out.println(ex.getMessage());
        }

        e.get_up();

        if (door.isOpen()) {
            System.out.println("Дверь открыта.");
        } else {
            System.out.println("Дверь закрыта.");
        }


        alien.alien_flat();

        Boolean anyAtHome = false;
        for (flatmates fm : flatmatesList) {
            if (fm.AreAtHome) {
                anyAtHome = true;
                break;
            }
        }

        if (anyAtHome == false) {
            f1.showMessage();
        }

        System.out.println("Мебель " + furn.similar);

        s.falling_asleep();
    }
}