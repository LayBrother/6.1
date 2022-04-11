import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;


public class AnagramTest {
    Anagram sut;

    @BeforeEach
    public void init() {
        System.out.println("RUN TEST");
        sut = new Anagram();
    }

    @AfterEach
    public void finished() {
        System.out.println("END TEST");
    }

    @Test
    public void test_AnagramByTrue() {
        // given:
        String a = "Anagram";
        String b = "marGana";

        // when:
        boolean result = sut.anagram(a, b);

        // then:
        assertTrue(result);
    }

    @Test
    public void test_StringByNull() {
        // given:
        String a = "null";

        // when:
        String result = sut.getString(a);

        // then:
        assertNotNull(result);
    }

    @Test
    public void test_LowCase() {
        // given:
        String a = "Anagram";
        String expected = "anagram";

        // when:
        String result = sut.getToLowCase(a);

        // then:
        assertEquals(expected, result);
    }
}