package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {
public void run() {
    while (frontIsClear()) {
        move();
        checkMiddleBeeper();
        pickAllBeepers();
        move();
    }
}
private void checkMiddleBeeper() {
    if (beepersPresent()) {
        move();
        move();
    }
}
private void pickAllBeepers() {
    if (noBeepersPresent()) {
        checkBeepersDown();
        checkBeepersUp();
    }
}                                                                                                 
private void checkBeepersDown() {
    turnRight();
    move();
    while (beepersPresent()) {
        pickBeeper();
    }
    turnAround();
    move();
}private void checkBeepersUp() {
    move();
    if (frontIsClear()) {
        move();
    }
    while (beepersPresent()) {
        pickBeeper();
    }
    turnAround();
    move();
    turnLeft();
    }
}
