package pl.adrianjd.albrecht;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int w, int h){
        super(); //teoretycznie już tutaj można by było zrobić super(x,y,w,h); ale w zadaniu wcześnie było napisane aby uzyć metod setLocation i setSize :)
        this.setLocation(x,y);
        this.setSize(w,h);
    }
    public double getPerimeter(){
        return 2*(this.height+this.width);
    }
    public double getArea(){
        return this.width*this.height;
    }
}
