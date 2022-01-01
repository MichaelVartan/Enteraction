package HumanClasses;

import Interfaces.Emotions;

public class Emotion implements Emotions {
    // number of emotions to implement
    // anger, happy, dissapointment...

    public String str;

    @Override
    public void display_emotion() {
        System.out.println(str);
    }
    public void setStr(String str){
        this.str = str;
    }
}
