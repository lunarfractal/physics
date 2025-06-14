public class Vector {
    double x, y;

    Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector add(Vector v) {
        return new Vector(this.x + v.x, this.y + v.y);
    }

    public Vector subtract(Vector v) {
        return new Vector(this.x - v.x, this.y - v.y);
    }

    public Vector scale(double scalar) {
        return new Vector(this.x * scalar, this.y * scalar);
    }

    public double distance(Vector v) {
        Vector subtracted = this.subtract(v);
        return Math.sqrt(Math.pow(subtracted.x, 2) + Math.pow(subtracted.y, 2));
    }

    public double dot(Vector v) {
        return this.x * v.x + this.y * v.y;
    }

    public Vector divide(Vector v) {
        return new Vector(this.x / v.x, this.y / v.y);   
    }

    public Vector divide(double scale) {
        return new Vector(this.x / scale, this.y / scale);
    }

    public Vector movePointByAngle(double distance, double angle) {
        Vector vec = new Vector(
            distance * Math.cos(angle),
            distance * Math.sin(angle)
        );

        return this.add(vec);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double direction() {
        return Math.atan2(this.y, this.x);
    }

    public Vector unitVector() {
        double mag = this.magnitude();

        double x = mag != 0 ? this.x / mag : 0;
        double y = mag != 0 ? this.y / mag : 0;

        return new Vector(x, y);
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
