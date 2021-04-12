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
    if (beeperPresent()) {
        move();
        move();
    }
}
private void pickAllBeepers() {
    if (noBeeperPresent()) {
        checkBeepersDown();
        checkBeepersUp();
    }
}                                                                                                 
private void checkBeepersDown() {
    turnRight();
    move();
    while (beeperPresent()) {
        pickBeeper();
    }
    turnAround();
    move();
}private void checkBeepersUp() {
    move();
    if (frontIsClear()) {
        move();
    }
    while (beeperPresent()) {
        pickBeeper();
    }
    turnAround();
    move();
    turnLeft();
    }
}
