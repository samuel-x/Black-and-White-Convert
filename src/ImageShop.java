
public class ImageShop {

    private ImageDocument image;

    public static void main(String args[]) {
        EffectLibrary.registerEffect("GrayScale", new GrayScaleEffect());
        listEffects();
        ImageLoader load = new ImageLoader(args[0]);
        ImageDocument image = load.loadImage();
        image.addTransform(EffectLibrary.getEffect("GrayScale"));
        image.renderImage("test.png");
        load.writeImage(image.getImg(), "test.png");
    }

//    private Effect[] processTransformations(String args[]) {
//        //
//    }
//
//    private void processImage(String image, Effect[] transforms) {
//        //
//    }



    public static void listEffects() {
        System.out.println(EffectLibrary.availableEffects());
    }
}
