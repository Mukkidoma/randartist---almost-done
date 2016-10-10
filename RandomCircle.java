/**
 * RandomCircle -- part of HA RandomArtist
 * example of a very simple RandomShape 
 * @author huub
 */
package randartist;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author huub
 */
class RandomCircle extends RandomShape {
    protected int radius;
    protected boolean fill; //true: filled
    
    public RandomCircle(int maxX, int maxY) {
        super(maxX, maxY);
        radius = random.nextInt(maxX/4);
        fill = random.nextBoolean();
    }

    @Override
    void draw(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setPaint(paint);
    if(fill){
        g.fillArc(x, y, radius, radius,0, 360);
    }else{
        g.drawArc(x, y, radius, radius,0, 360);
    }        
    }    
}
