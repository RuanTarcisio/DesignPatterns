package Bridge.bridge1;

import Bridge.bridge1.interfaces.Renderer;
import Bridge.bridge1.models.Circle;
import Bridge.bridge1.models.Shape;
import Bridge.bridge1.models.Square;
import Bridge.bridge1.renderer.RasterRenderer;
import Bridge.bridge1.renderer.VectorRenderer;

public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5);
        circle.draw();
        circle.resize(2);
        circle.draw();

        Shape square = new Square(rasterRenderer, 4);
        square.draw();
        square.resize(1.5f);
        square.draw();
    }
}