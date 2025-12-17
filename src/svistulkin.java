public class svistulkin extends man{

    public svistulkin(String name, sex sexValue, int age, String proffesion,
                      eyes_color eyesColor, hair_color hairColor) {
        super(name, sexValue, age, proffesion, eyesColor, hairColor);
    }


    public void coming_home() {
        System.out.println("Свистулькин приходит домой после работы.");
    }


    public void falling_asleep() {
        System.out.println("Свистулькин засыпает");
    }


}
