package ru.netology.sqr;

    import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void calculate() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculate(200, 300);
        assertEquals(expected, actual);
    }
}

