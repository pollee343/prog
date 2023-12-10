package interfaces;

public interface Action {

    default String startAction(String action) {
        return "начал " + action;
    }

    default String doingAction(String action) {
        return "продолжил " + action;
    }

    default String endAction(String action) {
        return "закончил " + action;
    }
}
