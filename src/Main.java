import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Image> gallery = new ArrayList<>();

        gallery.add(new ImageProxy("forest.jpg"));
        gallery.add(new ImageProxy("beach.jpg"));
        gallery.add(new ImageProxy("mountain.jpg"));

        System.out.println("Gallery created (no image loaded yet)");

        System.out.println();
        System.out.println("Showing first image twice:");
        show(gallery.get(0));
        show(gallery.get(0));

        System.out.println();
        System.out.println("Showing second image:");
        show(gallery.get(1));

        System.out.println();
        System.out.println("Third image was never displayed, so it was never loaded");
    }

    private static void show(Image image) {
        image.display();
    }
}
