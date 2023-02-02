import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class Ugla {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.BOLD, 40);
        StdDraw.setFont(font);
        StdDraw.text(0.5, 0.6, "TÖL203G Tölvunarfræði 2");
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.text(0.5, 0.4, "Logi Arnarsson");
        System.out.println(1.99 * (10 * 10 * 10 * 10 * 10 * 10 * 10 * 10));
    }
}
