package com.notas.core.converter;

import org.springframework.stereotype.Component;
import com.notas.core.entity.Nota;
import com.notas.core.model.Mnota;
import java.util.List;
import java.util.ArrayList;


@Component("convertidor")
public class Convertidor {
		public List<Mnota> convertirLista(List<Nota> notas){
			List<Mnota> mnotas = new ArrayList<>();
			for(Nota nota : notas) {
				mnotas.add(new Mnota(nota));
			}
			
			return mnotas;
		}
}
