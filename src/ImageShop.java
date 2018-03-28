
public class ImageShop {

    private ImageDocument image;

    public static void main(String args[]) {
        EffectLibrary.registerEffect("GrayScale", new GrayScaleEffect());
        listEffects();
        System.out.println("Loading " + args[0] + "...");
        ImageLoader load = new ImageLoader(args[0]);
        ImageDocument image = load.loadImage();
        image.addTransform(EffectLibrary.getEffect("GrayScale"));
        System.out.println("Effect(s) added!");
        image.renderImage("test.png");
        System.out.println("Writing image...");
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
