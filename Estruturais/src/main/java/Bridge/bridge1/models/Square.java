package Bridge.bridge1.models;

import Bridge.bridge1.interfaces.Renderer;

public class Square extends Shape {
    private float side;

    public Square(Renderer renderer, float side) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side);
    }

    @Override
    public void resize(float factor) {
        side *= factor;
    }
}