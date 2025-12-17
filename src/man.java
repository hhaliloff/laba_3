public abstract class man {
    private String name;
    private sex Sex;
    private int age;
    private String proffesion;
    private eyes_color eyesColor;
    private hair_color hairColor;

    protected man(String name, sex sex, int age, String proffesion, eyes_color eyesColor, hair_color hairColor) {
        this.name = name;
        this.Sex = sex;
        this.age = age;
        this.proffesion = proffesion;
        this.eyesColor = eyesColor;
        this.hairColor = hairColor;
    }

    public void sleep(){ System.out.println(name + " спит"); }
    public void eat(){System.out.println(name + " ест");}
    public  void walk(){System.out.println(name + " ходит");}
    public  void indicate(){System.out.println(name + " указывает");}
    public  void get_up(){System.out.println(name + " поднимается");}

    public abstract void coming_home();
    public abstract void falling_asleep();

}
