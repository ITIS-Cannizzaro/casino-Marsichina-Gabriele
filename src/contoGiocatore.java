public class contoGiocatore {
double contoG;
public contoGiocatore(double contoG) {
 this.contoG=contoG;
}
public double getContoGiocatore() {
 return contoG;
}
public void addSomma(double s) {
 contoG= contoG+s*5;
}
public void sottraiConto(double s) {
 contoG= contoG-s;
}
}