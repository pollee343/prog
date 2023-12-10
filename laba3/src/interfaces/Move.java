package interfaces;

public interface Move {

    default String goIn(String move){
        return "зашёл " + move;
    }
    default String beInPlace(String move){
        return "находится " + move;
    }

    default String goOut(String move){
        return "вышел " + move;
    }
}
