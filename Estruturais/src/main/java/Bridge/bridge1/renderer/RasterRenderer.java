package Bridge.bridge1.renderer;

import Bridge.bridge1.interfaces.Renderer;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius " + radius + " as pixels");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a square with side " + side + " as pixels");
    }
}