import java.util.Random;

public class RandomGenerator {
    static final int LOWERBOUND = 32;
    static final int UPPERBOUND = 126;
    
    public static void main(String[] args){
        for (int i = 0; i < 15; i++){
            System.out.printf("%c ", getRandomLowerCaseLetter());
            System.out.printf("%c ", getRandomUpperCaseLetter());
            System.out.printf("%d ", getRandomDigitCharacter());
            System.out.printf("%c\n", getRandomCharacter());
//            System.out.println(getRandomDigitRange());
        }
    }
    
    static char getRandomLowerCaseLetter(){
        Random r = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return alphabet.charAt(r.nextInt(alphabet.length()));
    }
    
    static char getRandomUpperCaseLetter(){
        Random r = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQQRSTUVWXYZ";
        return alphabet.charAt(r.nextInt(alphabet.length()));
    }
    
    static int getRandomDigitCharacter(){
        Random r = new Random();
        return r.nextInt(10);
    }
    
    static char getRandomCharacter(){
        Random r = new Random();
        return (char) (r.nextInt(UPPERBOUND - LOWERBOUND) + LOWERBOUND);
    }
    
    static int getRandomDigitRange(){
        Random r = new Random();
        return r.nextInt(100);
    }
}

