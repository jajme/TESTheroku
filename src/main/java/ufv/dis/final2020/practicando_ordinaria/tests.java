package ufv.dis.final2020.practicando_ordinaria;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.itextpdf.text.DocumentException;

public class tests {

	@Test
	public final void adduser() {
		lista lisatado = new lista();
		persona p =new persona("1", "1", "1","1", "1",1);
		lisatado.add_alumno(p);
		assertEquals(true, lisatado.getListaPersonas().contains(p));
	}
	@Test
	public final void pdf() throws FileNotFoundException, DocumentException {
		persona p = new persona("1", "1", "1","1", "1",1);
		pdf.add_alumno(p);
	}
	@Test
	public final void mayoria_edad() {
		persona p1 =new persona("1", "1", "1","1", "1",1);
		persona p2 =new persona("1", "1", "1","1", "1",18);
		assertEquals(false, p1.getAdult());
		assertEquals(true, p2.getAdult());
	}

}
