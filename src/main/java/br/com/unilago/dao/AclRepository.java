package br.com.unilago.dao;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.unilago.model.ControleAcesso;

@Repository
public class AclRepository {
	
	@Autowired
	private DataRepository repo;
	
	public String validar(ControleAcesso view){
		Map<String, List<String>> map = repo.getAclMap();
		
		List<String> list = map.get(view.getSujeito());
		
		String ret;
		
		for(String s : list){
			if(StringUtils.contains(s, view.getObjeto())){
				ret = "Valido";
				if(StringUtils.contains(s, "*"))
					ret = ret + " - Restrito";
				
				return ret;
			}
		}
		
		return "Negado";
	}

}
