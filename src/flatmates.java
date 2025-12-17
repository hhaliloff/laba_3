public class flatmates extends man{

    private Boolean AreAtHome = false;

    public flatmates(String name, sex sexValue, int age, String proffesion,
                      eyes_color eyesColor, hair_color hairColor) {
        super(name, sexValue, age, proffesion, eyesColor, hairColor);
    }

    public void not_at_home(){
        System.out.println("Соседи отсутствуют дома.");
    }

    public void coming_home() {}
    public void falling_asleep() {}
}
