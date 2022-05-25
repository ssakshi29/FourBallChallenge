import processing.core.PApplet;


public class MainClass extends PApplet{

    public static final float DIAMETER =21;
    public static final float HEIGHT =480;
    float x1=0,x2=0,x3=0,x4=0;


    public static void main(String args[]){
        PApplet.main("MainClass",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(680,480);
    }

    @Override
    public void setup() {
       

    }

    @Override
    public void draw() {
        ellipse(x1+=1,HEIGHT/5  , DIAMETER, DIAMETER);
        ellipse(x2+=2,HEIGHT*2/5, DIAMETER, DIAMETER);
        ellipse(x3+=3,HEIGHT*3/5, DIAMETER, DIAMETER);
        ellipse(x4+=4,HEIGHT*4/5, DIAMETER, DIAMETER);
    }


}
