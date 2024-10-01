package Bridge.bridge1.models;


import Bridge.bridge1.interfaces.Renderer;

public abstract class Shape {
    protected Renderer renderer;

    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
    public abstract void resize(float factor);
}