public class contoCasinò{
double contoC;
public contoCasinò(double contoC) {
 this.contoC=contoC;
}
public double getContoCasinò() {
 return contoC;
}
public void sottraiConto(double s) {
 contoC = contoC-s*5;
}
public void addConto(double s) {
 contoC= contoC-s;
}
}