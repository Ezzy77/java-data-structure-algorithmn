package ADT;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {
    Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue(10);
    }


    @Test
    void TestInsertLongValue() {
        // arrange
        long value = 9;
        queue.insert(value);

        // act
        int expectedArraySize = 1;
        long expectedArrayValueAtIndex0 = 9;

        int actualArraySize  = queue.size();
        long actualArrayValueAtIndex0 = queue.peekFront();


        // assert
        Assertions.assertEquals(expectedArraySize, actualArraySize );
        Assertions.assertEquals(expectedArrayValueAtIndex0, actualArrayValueAtIndex0 );



    }

    @Test
    void remove() {
    }

    @Test
    void peekFront() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void isFull() {
    }

    @Test
    void size() {
    }
}