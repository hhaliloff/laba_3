public class WrongEntranceException extends Exception {
    @Override
    public String getMessage() {
        return "Свистулькин вошёл не в свой подъезд!";
    }
}