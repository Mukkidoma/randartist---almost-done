/**
 * the mother of all random shapes
 * should be used unchanged
 *
 * @author huub
 */
package randartist;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.util.Random;

abstract class RandomShape {  
    /** random number generator; shared by all RandomShapes */
    static Random random = new Random(); 
    
    /** color used for drawing this shape **/
    protected Color color;
    protected Color color2;
    protected GradientPaint paint;
    /** position of the shape (upper left corner) **/
    protected int x, y;  
    
    /**
     * initializes color and position to random values
     * 
     * @param maxX, maxY give maximum values for the position
     */
    public RandomShape( int maxX, int maxY ) {
        // initialize to a random position
        x = random.nextInt(maxX);
        y = random.nextInt(maxY);
        // initialize to a random color
        float r = random.nextFloat();
        float g = random.nextFloat();
        float b = random.nextFloat();
        float a = random.nextFloat();
        color = new Color(r,g,b);
        color2 = new Color(b,r,g,a);
        paint = new GradientPaint(0,0,color, maxX, maxY, color2);
        
        
    }
    
    abstract void draw(Graphics g);
}
