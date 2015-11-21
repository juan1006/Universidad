package com.mycompany.desarrollovca.metodGeneric;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FechaGeneric {

	public static Date obtenerFechaActual() {
		String fechaActual = "";
		Calendar fecha = new GregorianCalendar();

		int a�o = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);

		fechaActual = "" + a�o + "/" + (mes + 1) + "/" + dia;

		return new Date(fechaActual);
	}

}
