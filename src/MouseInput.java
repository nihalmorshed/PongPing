import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();

//        public Rectangle playButton = new Rectangle((GamePanel.GAME_WIDTH)/2-80,100,100,50);
//        public Rectangle helpButton = new Rectangle((GamePanel.GAME_WIDTH)/2-80,160,100,50);
//        public Rectangle quitButton = new Rectangle((GamePanel.GAME_WIDTH)/2-80,220,100,50);

        if(mx >=(GamePanel.GAME_WIDTH)/2-80 && mx <= (GamePanel.GAME_WIDTH)/2+20){
            if(my>=100 && my<=155){
                GamePanel.state= GamePanel.STATE.GAME;
            }
        }
        if(mx >=(GamePanel.GAME_WIDTH)/2-80 && mx <= (GamePanel.GAME_WIDTH)/2+20){
            if(my>=160 && my<=215){
                GamePanel.state= GamePanel.STATE.GAME;
            }
        }
        if(mx >=(GamePanel.GAME_WIDTH)/2-80 && mx <= (GamePanel.GAME_WIDTH)/2+20){
            if(my>=220 && my<=272){
               System.exit(1);
            }
        }



    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
