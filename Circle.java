public class Circle {
    double radius, mass;
    Vector position, velocity, acceleration;

    Circle(double mass, double x, double y, double radius) {
        this.radius = radius;
        this.mass = mass;
        this.position = new Vector(x, y);
        this.velocity = new Vector(0, 0); // don't allow new objects to move instantly
        this.acceleration = new Vector(0, 0);
    }

    public void update() {
        this.velocity = this.velocity.add(this.acceleration);
        this.position = this.position.add(this.velocity);
        this.acceleration = new Vector(0, 0); // single frame acceleration?
    }

    public void addForce(Vector force) {
        this.acceleration = this.acceleration.add(force.divide(this.mass));
    }

    public void addFriction(double factor) {
        this.velocity = this.velocity.scale(factor);
    }

    public boolean isCollidingWith(Circle c) {
        return this.position.distance(c.position) <= this.radius + c.radius;
    }
}
