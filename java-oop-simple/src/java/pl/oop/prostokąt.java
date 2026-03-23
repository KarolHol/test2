public class Prostokąt {
    double szerokosc, wysokosc;

    public Prostokąt(double s, double w) {
        this.szerokosc = s;
        this.wysokosc = w;
    }

    public double pole() {
        return szerokosc * wysokosc;
    } // szer * wys

    public double obwod() {
        return 2 * (szerokosc + wysokosc);
    } // 2*(szer+wys)

    public void zwiekszO20() {
        szerokosc *= 1.2;
        wysokosc *= 1.2;
    }
}

