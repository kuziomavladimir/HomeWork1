package homework2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat cat = new Cat("Valera");

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void doEat() {
    }

    @Test
    void doVote() {
//        assertAll();
    }

    @Test
    void doMotion() {
        assertEquals(1,1);
    }

    @Test
    void doClimbUpTrees() {
    }

    @Test
    void doSwim() {
    }

    @Test
    void checkHunger() {
    }
}