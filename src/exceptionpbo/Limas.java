package exceptionpbo;
public class Limas {
    double volume (double alas, double tinggi_alas, double tinggi) {
        return ((alas*tinggi_alas)*tinggi)/6 ;
    }
    
    double luas (double alas, double tinggi_alas, double tinggi_sisi) {
        return (0.5*alas*tinggi_alas)+(3*(0.5*alas*tinggi_sisi));
    }
}
