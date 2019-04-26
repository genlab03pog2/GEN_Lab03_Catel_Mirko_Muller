import java.util.Random;

public class Die {
    int faceValue;
    int maxValue;

    Die(int maxValue){
        this.maxValue = maxValue;
    }

    public void roll() {
        int max = maxValue;
        int min = 1;
        Random rand = new Random();
        faceValue = rand.nextInt((max - min) + 1) + min;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
