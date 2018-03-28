import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class ImageDocument {

    public BufferedImage img;
    public ArrayList<Effect> transforms;
    public String outputFile;

    public ImageDocument(BufferedImage img) {
        this.img = img;
        this.transforms = new ArrayList<>();

    }

    public void addTransform(Effect t) {
        transforms.add(t);
    }

//    public boolean addTransformations(Effect[] trans) {
//
//    }

    public void renderImage(String outfile) {
        for (Effect effect : transforms) {
            this.img = effect.applyEffect(img);
        }
        int w = this.img.getWidth();
        int h = this.img.getHeight();
        BufferedImage bi = new
                BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.getGraphics();
        g.drawImage(img, 0, 0, null);
    }

    public BufferedImage getImg() {
        return img;
    }
}
