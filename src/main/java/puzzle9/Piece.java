package puzzle9;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Piece implements KeyListener {
    private static final Logger logger = (Logger) LogManager.getLogger(Piece.class);

    private Game game;

    private Point pointPiece=new Point();

    private Integer sideSize=150;

    private Integer number=-1;

    public Piece(Game game){
        this.game=game;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setPointPiece(Point pointPiece) {
        this.pointPiece = pointPiece;
    }

    public Point getPointPiece() {
        return pointPiece;
    }



    public void move(){
    }

    public void paint(Graphics g) {
        Graphics2D g2=(Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if(number!=8) {
            g2.setColor(Color.yellow);
            g2.fillRect((int) pointPiece.getX() * sideSize, (int) pointPiece.getY() * sideSize, sideSize, sideSize);
            g2.setColor(Color.BLUE);
            g2.drawString(number.toString(), (int) pointPiece.getX() * sideSize + sideSize / 2, (int) pointPiece.getY() * sideSize + sideSize / 2);
        }
    }


    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
}