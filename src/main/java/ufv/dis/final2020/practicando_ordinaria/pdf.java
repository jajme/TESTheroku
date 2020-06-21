package ufv.dis.final2020.practicando_ordinaria;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class pdf {
	static void add_alumno(persona p) throws FileNotFoundException, DocumentException {
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("test.pdf"));
		document.open();
		document.add(new Paragraph("name "+p.getName()));
		document.add(new Paragraph("surname "+p.getSurname()));
		document.add(new Paragraph("dni "+p.getDni()));
		document.add(new Paragraph("email "+p.getEmail()));
		document.add(new Paragraph("name "+ p.getNacimiento()));
		document.add(new Paragraph("adult: "+p.getAdult().toString()));
		document.add(new Paragraph("name "+ new java.util.Date()));
		document.close();
	}
}