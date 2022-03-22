import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomGeneratorTest {
    
    @Test
    @DisplayName("Generate Lower Case Letter")
    void getRandomLowerCaseLetter() {
        char c = RandomGenerator.getRandomLowerCaseLetter();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        assertTrue(alphabet.indexOf(c) != -1);
    }
    
    @Test
    void getRandomUpperCaseLetter() {
        char c = RandomGenerator.getRandomUpperCaseLetter();
        String alphabet = "ABCDEFGHIJKLMNOPQQRSTUVWXYZ";
        assertTrue(alphabet.indexOf(c) != -1);
    }
    
    @Test
    void getRandomDigitCharacter() {
        int num = RandomGenerator.getRandomDigitCharacter();
        assertTrue(num >= 0 && num <= 9);
    }
    
    @Test
    void getRandomCharacter() {
        assertTrue(Character.class.isInstance(RandomGenerator.getRandomCharacter()));
    }
    
    @Test
    void getRandomDigitRange(){
        int num = RandomGenerator.getRandomDigitRange();
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++){
            if (num%i == 0){
                flag = true;
                System.out.printf("Generated number: %d", num);
                break;
            }
        }
        System.out.printf("Generated number: %d", num);
        assertFalse(flag);
        
    }
}