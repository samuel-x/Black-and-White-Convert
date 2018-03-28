import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    private String filename;

    public ImageLoader (String file){
        this.filename = file;
    }

    public ImageDocument loadImage() {
        BufferedImage img = null;
        try {
                img = ImageIO.read(new File(filename));
            }
        catch (IOException e) {
        }
        return new ImageDocument(img);
    }

    public void writeImage(BufferedImage img, String outputFile) {
        try {
            // retrieve image;
            File out = new File(outputFile);
            ImageIO.write(img, "png", out);
            }
        catch (IOException e) {
        }
    }


}
