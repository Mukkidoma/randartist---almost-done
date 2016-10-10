/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randartist;

/**
 *
 * @author timothy
 */
import java.awt.*;

class RandomSpiral extends RandomShape {
    protected int iterations;
    protected int midx;
    protected int midy;
    protected int arcWidth;
    protected int arcGrow;
    protected boolean stroking;
    protected int strokewidth;
    final static float dash[] = {10.0f};
    
    public RandomSpiral(int maxX, int maxY){
        super(maxX,maxY);
        stroking = random.nextBoolean();
        strokewidth = random.nextInt(5)+1;
        iterations = random.nextInt(10)+2;
        midx = random.nextInt(maxX);
        midy = random.nextInt(maxY);
        
        arcWidth = random.nextInt(15)+5;
        arcGrow = random.nextInt(10)+5;
        }   
    
      
    
    @Override
    void draw (Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    if(stroking){
    g2.setStroke(new BasicStroke(strokewidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 5.0f, dash, 0.0f));
    } else {
        g2.setStroke(new BasicStroke(strokewidth));
    }
    g2.setPaint(paint);
    
    
    
    
    for (int i = 0; i < iterations; i++) {
            g.drawArc(midx - arcWidth, midy - arcWidth, 2 * arcWidth, 2 * arcWidth, 0, 180);
            arcWidth += arcGrow;
            g.drawArc(midx - arcWidth, midy - arcWidth, 2 * arcWidth - arcGrow, 2 * arcWidth, 180, 180);
    }
    
}
    
}
