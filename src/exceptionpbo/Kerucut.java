package exceptionpbo;
public class Kerucut {
    double phi = 3.14;
    double volume (double r, double s, double t){
        return (phi*r*r*t)/t;
    }
    double luas (double r, double s){
        return (phi*r*s)+(phi*r*r);
    }
}
