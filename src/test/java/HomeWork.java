package guru.qa;
        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

        import java.util.Random;

public class HomeWork {
    @Test
    void HomeWork0(){
        Assertions.assertTrue(new Random().nextInt()>1);
    }
    @Test
    void HomeWork1(){
        Assertions.assertTrue(new Random().nextInt()>2);
    }
}
