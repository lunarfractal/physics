public class Circle {
    double radius;
    double mass;
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
    }

    public void addForce(Vector force) {
        this.acceleration = force.divide(this.mass);
    }

    public boolean isCollidingWith(Circle c) {
        return this.position.distance(c.position) <= this.radius;
    }
}
