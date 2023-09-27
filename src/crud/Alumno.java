package crud;

public class Alumno {

String NumControl;
String Nom;
String ap;
String am;
String grupo;
String carrera;
String turno;
public String getNumControl() {
	return NumControl;
}
public void setNumControl(String numControl) {
	NumControl = numControl;
}
public String getNom() {
	return Nom;
}
public void setNombre(String Nom) {
	this.Nom = Nom;
}
public String getAp() {
	return ap;
}
public void setAp(String ap) {
	this.ap = ap;
}
public String getAm() {
	return am;
}
public void setAm(String am) {
	this.am = am;
}
public String getGrupo() {
	return grupo;
}
public void setGrupo(String grupo) {
	this.grupo = grupo;
}
public String getCarrera() {
	return carrera;
}
public void setCarrera(String carrera) {
	this.carrera = carrera;
}
public String getTurno() {
	return turno;
}
public void setTurno(String turno) {
	this.turno = turno;
}
public void escribirString() {
System.out.println("numero de control"+NumControl);
System.out.println("nombre"+Nom);
System.out.println("ap"+ap);
System.out.println("am"+am);
System.out.println("grupo"+grupo);
System.out.println("carrera"+carrera);
System.out.println("turno"+turno);

}


}


