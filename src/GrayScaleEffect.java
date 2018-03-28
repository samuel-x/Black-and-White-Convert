import java.awt.*;
import java.awt.image.BufferedImage;

public class GrayScaleEffect implements Effect {

    @Override
    public BufferedImage applyEffect(BufferedImage img) {
        try {

            int width = img.getWidth();
            int height = img.getHeight();

            for(int i=0; i<height; i++){

                for(int j=0; j<width; j++){

                    Color c = new Color(img.getRGB(j, i));
                    int red = (int)(c.getRed() * 0.299);
                    int green = (int)(c.getGreen() * 0.587);
                    int blue = (int)(c.getBlue() *0.114);
                    Color newColor = new Color(red+green+blue,

                            red+green+blue,red+green+blue);

                    img.setRGB(j,i,newColor.getRGB());
                }
            }

            return img;

        }
        catch (Exception e) {

        }
        return null;
    }
}
