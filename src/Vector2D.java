public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double magnitud(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
    public Vector2D suma(Vector2D vector){
        return new Vector2D(this.x+vector.getX(),this.y*vector.getY());
    }

    public Vector2D resta(Vector2D vector){
        return new Vector2D(this.x-vector.getX(),this.y-vector.getY());
    }
    public Vector2D multiplicacion(Vector2D vector){
        return new Vector2D(this.x*vector.getX(),this.y*vector.getY());
    }

    @Override
    public String toString(){
        return "("+this.getX()+"i ,"+this.getY()+"j)";
    }
}
