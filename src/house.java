public class house {
    private String type = new String("башенный");
    private String peculiarity = new String("вращающийся");
    private int enters = 4;
    public directions current_direction = directions.EAST;

    public house(){
        System.out.println("Дом");
    }

    public void set_direction(){
        double x = Math.random();
        if (x <= 0.25)
            this.current_direction = directions.EAST;
        else if (x > 0.25 && x <= 0.5)
            this.current_direction = directions.SOUTH;
        else if (x > 0.5 && x <= 0.75)
            this.current_direction = directions.WEST;
        else
            this.current_direction = directions.NORTH;
    }

    public void direction() {
        System.out.println("Сейчас дом повернут к " + this.current_direction);
    }

    public void description() {
        System.out.println("Дом имеет " + enters + " подъезда и является " + peculiarity + " домом " + type + " тип.");
    }
}
