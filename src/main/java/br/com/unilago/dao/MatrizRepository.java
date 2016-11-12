package br.com.unilago.dao;

import java.lang.reflect.Field;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.unilago.model.ControleAcesso;
import br.com.unilago.model.MatrizAcesso;

@Repository
public class MatrizRepository {

	@Autowired
	private DataRepository repo;

	public String validar(ControleAcesso view) {
		List<MatrizAcesso> matrizList = repo.getMatrizList();
		MatrizAcesso matriz = null;

		for (MatrizAcesso m : matrizList) {
			if (m.getSujeito().equals(view.getSujeito())){
				matriz = m;
				break;
			}
		}

		String ret = null;
		List<String> vals = null;

		try {
			Field field = MatrizAcesso.class.getDeclaredField(StringUtils.lowerCase(view.getObjeto()));
			field.setAccessible(true);

			vals = (List<String>) field.get(matriz);
		} catch (Exception e) {
			System.out.println("erro ao recuperar");
		}
		
		if(vals == null)
			return "Negado";

		for (String s : vals) {
			if (StringUtils.contains(s, "X")) {
				ret = "Valido";
			}
			if (StringUtils.contains(s, "*"))
				ret = ret + " - Restrito";
		}

		if (ret != null)
			return ret;

		return "Negado";
	}

}
