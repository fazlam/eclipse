package com.xworkz.collation.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collation.constant.Type;
import com.xworkz.collation.dto.DataBaseVenderDTO;

public class DataBaseVenderRunner {

	public static void main(String[] args) {
		Collection<DataBaseVenderDTO> DataBaseVenderDTO=new ArrayList<DataBaseVenderDTO>();
		
		DataBaseVenderDTO.add(new DataBaseVenderDTO("Oracle DataBase","Oracle",10000,2,Type.ORACALE));
		DataBaseVenderDTO.add(new DataBaseVenderDTO("SQL DataBase","MySQL",20000,1,Type.MYSQL));
		DataBaseVenderDTO.add(new DataBaseVenderDTO("IBM DataBase","IBM",50000,4,Type.IBM));
		DataBaseVenderDTO.add(new DataBaseVenderDTO("Amazon DataBase","Amazon",70000,2,Type.AMAZON_RDS));
		
		DataBaseVenderDTO.stream().map(ele->ele.toUpperCase()).collect(Collectors.toList()).forEach(ele->System.out.println(ele));

	}

}
