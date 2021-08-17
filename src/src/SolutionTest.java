
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SolutionTest {
    @Test
    public void  testSolutin()throws Exception{
        String string1 =" ";
        String string2 ="aaaaaaa";
        String string3 ="asdasdwdwa";
        String string4 ="pxdpxdfde ";
        assertEquals(1,Solution.lengthOfLongestSubstring(string1));
        assertEquals(1,Solution.lengthOfLongestSubstring(string2));
        assertEquals(4,Solution.lengthOfLongestSubstring(string3));
        assertEquals(4,Solution.lengthOfLongestSubstring(string4));

    }

}
