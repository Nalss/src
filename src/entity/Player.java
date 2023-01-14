package entity;

import main.GamePanel;
import main.KeyHandler;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends Entity {

    GamePanel gp;
    KeyHandler keyH;
    // Player cords
    public int x;
    public int y;

    public Player(GamePanel gp, KeyHandler keyH) {

        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
        getPlayerImage();

    }

    public void setDefaultValues() {

        x = 324;
        y = 320;
        speed = 5;
        direction = "right";
    }

    public void getPlayerImage() {

        try {

            left1 = ImageIO.read(getClass().getResourceAsStream("res/player/New Piskel-3.png.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("res/player/New Piskel-4.png.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("res/player/New Piskel-5.png.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("res/player/New Piskel-6.png.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        if (keyH.leftPressed || keyH.rightPressed) {
            if (keyH.leftPressed) {
                direction = "left";
                x -= speed;
            } else {
                direction = "right";
                x += speed;
            }

            if (x < -16) {
                x += speed;
            } else if (x > 659) {
                x -= speed;
            }

            spriteCounter++;
            if (spriteCounter > 10) {
                if (spriteNum == 1) {
                    spriteNum = 2;
                } else if (spriteNum == 2) {
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }
        }

    }

    public void draw(Graphics2D g2) {

        BufferedImage image = null;

        switch (direction) {
            case "left" -> {
                if (spriteNum == 1) {
                    image = left1;
                }
                if (spriteNum == 2) {
                    image = left2;
                }
            }
            case "right" -> {
                if (spriteNum == 1) {
                    image = right1;
                }
                if (spriteNum == 2) {
                    image = right2;
                }
            }
        }
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
    }
}
