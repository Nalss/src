package entity;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class Spike extends Entity {

    static GamePanel gp;
    byte spawn = 0;
    byte a = 0;
    // Spike cords
    public int xSpike;
    public int ySpike;
    Player player = new Player(gp, null);

    public Spike(GamePanel gp) {
        Spike.gp = gp;
        setDefaultValuesSpike();
        getSpikeImage();

    }

    public void setDefaultValuesSpike() {

        xSpike = 0;
        ySpike = 0;
        speed = 10;
    }

    public void getSpikeImage() {

        try {
            down1 = ImageIO.read(getClass().getResourceAsStream("res/spike/spike.png.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {

        Random r = new Random();

        if (spawn == 70) {
            xSpike = r.nextInt(9) * 80;
            ySpike = -80;
            spawn = 0;
        } else {
            spawn++;
        }
        ySpike += speed;

        Player player = new Player(gp, null);

        if (player.x > xSpike - 50 && player.x < xSpike + 50) {
            System.out.println("ded");
        }
    }

    public void draw(Graphics2D g2) {

        BufferedImage image = down1;
        g2.drawImage(image, xSpike, ySpike, gp.tileSize, gp.tileSize, null);
    }
}
