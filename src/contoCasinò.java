public class contoCasinÃ²{
double contoC;
public contoCasinÃ²(double contoC) {
 this.contoC=contoC;
}
public double getContoCasinÃ²() {
 return contoC;
}
public void sottraiConto(double s) {
 contoC = contoC-s*5;
}
public void addConto(double s) {
 contoC= contoC-s;
}
}