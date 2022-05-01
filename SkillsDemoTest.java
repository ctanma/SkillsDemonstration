import static org.junit.Assert.*;
import org.junit.*;

public class SkillsDemoTest {
    @Test
    public void firstLetterTest(){
        assertEquals("d",SkillsDemo.firstLetter("dog")); //expect this to fail bc != "d"
    }
}
