package br.com.unilago.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.com.unilago.model.MatrizAcesso;

@Repository
public class DataRepository {
	
	public List<String> getSujeitos(){
		return new ArrayList<>(Arrays.asList("Alice", "Bob", "Carol", "Davi", "Eva"));
	}
	
	public List<String> getObjetos(){
		return new ArrayList<>(Arrays.asList("Arquivo1", "Arquivo2", "Arquivo3", "Arquivo4", "Programa1", "Programa2"));
	}
	
	public Map<String,List<String>> getAclMap(){
		Map<String, List<String>> map = new HashMap<>();
		map.put("Alice", Arrays.asList("Arquivo3*","Arquivo4","Programa2"));
		map.put("Bob", Arrays.asList("Arquivo3*","Arquivo4","Programa2","Arquivo1"));
		map.put("Carol", Arrays.asList("Arquivo3*","Arquivo4","Programa2"));
		map.put("Davi", Arrays.asList("Arquivo3*","Arquivo4","Programa2","Programa1"));
		map.put("Eva", Arrays.asList("Arquivo3*","Arquivo4","Programa2","Arquivo2"));
		return map;
	}
	
	public List<MatrizAcesso> getMatrizList(){
		List<MatrizAcesso> list = new ArrayList<>();
		
		MatrizAcesso m = new MatrizAcesso();
		m.setSujeito("Alice");
		m.setArquivo3(Arrays.asList("X","*"));
		m.setArquivo4(Arrays.asList("X"));
		m.setPrograma2(Arrays.asList("X"));
		
		list.add(m);
		
		m = new MatrizAcesso();
		m.setSujeito("Bob");
		m.setArquivo3(Arrays.asList("X","*"));
		m.setArquivo4(Arrays.asList("X"));
		m.setPrograma2(Arrays.asList("X"));
		m.setArquivo1(Arrays.asList("X"));
		
		list.add(m);
		
		m = new MatrizAcesso();
		m.setSujeito("Carol");
		m.setArquivo3(Arrays.asList("X","*"));
		m.setArquivo4(Arrays.asList("X"));
		m.setPrograma2(Arrays.asList("X"));
		
		list.add(m);
		
		m = new MatrizAcesso();
		m.setSujeito("Davi");
		m.setArquivo3(Arrays.asList("X","*"));
		m.setArquivo4(Arrays.asList("X"));
		m.setPrograma2(Arrays.asList("X"));
		m.setPrograma1(Arrays.asList("X"));
		
		list.add(m);
		
		m = new MatrizAcesso();
		m.setSujeito("Eva");
		m.setArquivo3(Arrays.asList("X","*"));
		m.setArquivo4(Arrays.asList("X"));
		m.setPrograma2(Arrays.asList("X"));
		m.setArquivo2(Arrays.asList("X"));
		
		list.add(m);
		
		return list;
	}
	
	

}
