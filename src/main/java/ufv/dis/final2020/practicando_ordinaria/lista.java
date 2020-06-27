package ufv.dis.final2020.practicando_ordinaria;

import java.util.ArrayList;

public class lista {
	

private static ArrayList<persona> listaPersonas;

public ArrayList<persona> getListaPersonas() {
	return listaPersonas;
}

public void setListaPersonas(ArrayList<persona> listaPersona) {
	lista.listaPersonas = listaPersona;
}

public lista() {
	lista.listaPersonas = new ArrayList<persona>() ;
}

public void add_alumno(persona p) {
	lista.listaPersonas.add(p);
}

}
