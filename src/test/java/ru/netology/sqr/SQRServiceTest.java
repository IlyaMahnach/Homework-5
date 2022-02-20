package ru.netology.sqr;

    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void calculate1() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculate(200, 300);
        assertEquals(expected, actual);
    }


    @Test
    void calculate2() {
        SQRService service = new SQRService();
        int expected = 5;
        int actual = service.calculate(0, 200);
        assertEquals(expected, actual);
    }

    @Test
    void calculate3() {
        SQRService service = new SQRService();
        int expected = 21;
        int actual = service.calculate(100, 900);
        assertEquals(expected, actual);
    }
}