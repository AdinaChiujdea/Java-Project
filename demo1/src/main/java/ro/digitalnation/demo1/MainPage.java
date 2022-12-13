package ro.digitalnation.demo1;

public class MainPage {
  private int Despre;
  private int Continut;
  private int Introducere;
  private int Carti;
  public MainPage(int despre, int introducere, int continut, int carti) {
	super();
	setDespre(despre);
	setContinut(continut);
	setCarti(carti);
}
public int getContinut() {
	return Continut;
}
public void setContinut(int continut) {
	Continut = continut;
}
public int getCarti() {
	return Carti;
}
public void setCarti(int carti) {
	Carti = carti;
}
public int getDespre() {
	return Despre;
}
public void setDespre(int despre) {
	Despre = despre;
}
public int getIntroducere() {
	return Introducere;
}
public void setIntroducere(int introducere) {
	Introducere = introducere;
}
}
