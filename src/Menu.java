import java.awt.*;

public class Menu {
    static final String HEADER = "PINGPONG";
    public Rectangle playButton = new Rectangle((GamePanel.GAME_WIDTH)/2-80,100,100,50);
    public Rectangle helpButton = new Rectangle((GamePanel.GAME_WIDTH)/2-80,160,100,50);
    public Rectangle quitButton = new Rectangle((GamePanel.GAME_WIDTH)/2-80,220,100,50);

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;

        g.setColor(Color.blue);
        g.setFont(new Font("Consolas",Font.PLAIN,60));
        g.drawString(HEADER, (GamePanel.GAME_WIDTH)/2-150, 60);
        g.setFont(new Font("Consolas",Font.PLAIN,30));
        g.drawString("Play",playButton.x+10, playButton.y+30);
        g2d.draw(playButton);
        g.drawString("Help",helpButton.x+10, helpButton.y+30);
        g2d.draw(helpButton);
        g.drawString("Quit",quitButton.x+10, quitButton.y+30);
        g2d.draw(quitButton);
    }
}
