package tile;

import main.GamePanel;
import javax.imageio.ImageIO;
import java.awt.*;

import java.io.IOException;

public class TileManager {

    GamePanel gp;
    Tile[] tile;
    int mapTileNum[][];

    public TileManager(GamePanel gp) {

        this.gp = gp;

        tile = new Tile[10];
        mapTileNum = new int[gp.maxScreenCol][gp.maxScreenRow];

        getTileImage();
    }
    public void getTileImage() {

        try {

            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/entity/res/tiles/Grass.png.png"));

            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/entity/res/tiles/wall.png.png"));

            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/entity/res/tiles/Water.png.png"));

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void draw(Graphics2D g2) {
        g2.drawImage(tile[0].image,0,400, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,80, 400, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,160,400, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,240,400, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,320,400, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,400,400, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 480,400, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,560,400, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,640,400, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,0,320, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,80, 320, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,160,320, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,240,320, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,320,320, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,400,320, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image, 480,320, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,560,320, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,640,320, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,0,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,80, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,160,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,240,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,320,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,400,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 480,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,560,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,640,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,0,80, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,80, 80, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,160,80, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,240,80, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,320,80, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,400,80, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 480,80, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,560,80, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,640,80, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,0,160, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,80, 160, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,160,160, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,240,160, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,320,160, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,400,160, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 480,160, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image,560,160, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,640,160, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,0,240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,80, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,160,240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,240,240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,320,240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,400,240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image, 480,240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,560,240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image,640,240, gp.tileSize, gp.tileSize, null);
    }
}
