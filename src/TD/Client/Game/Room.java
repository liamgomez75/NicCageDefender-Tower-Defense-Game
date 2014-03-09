
package TD.Client.Game;

import java.awt.*;

/**
 *
 * @author Liam Gomez <liamgomez75@gmail.com>
 */
public class Room {
    
    public int worldWidth = 9;
    public int worldHeight = 7;
    public int blockSize = 64;
    public Block[][] block;
    
    public Room() {
        define();
    }
    
    public void define() {
        block = new Block[worldHeight][worldWidth];
        
        for(int y = 0; y < block.length; y++) {
            for(int x =0; x < block[0].length; x++) {
                block[y][x] = new Block((Canvas.myWidth/2) - (worldWidth*blockSize/2) + (x*blockSize), y*blockSize, blockSize, blockSize, Value.groundGrass, Value.airAir);
            }
        }
    }
    
    public void pyshic() {
        
    }
    
    public void draw(Graphics g) {
        for(int y = 0; y < block.length; y++) {
            for(int x =0; x < block[0].length; x++) {
                block[y][x].draw(g);
            }
        }
    }
}