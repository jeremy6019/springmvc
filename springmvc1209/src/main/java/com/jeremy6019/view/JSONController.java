package com.jeremy6019.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Rest API Controller를 만들어주는 어노테이션 
@RestController
public class JSONController {
	
	@RequestMapping(value="rest.csv", method=RequestMethod.GET)
	public String csv(Model model) {
		String result = "엘사, 안나, 크리스토프, 울라프";
		return result;
	}
	
	@RequestMapping(value="rest.json", method=RequestMethod.GET)
	public Map json(Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<String>list = new ArrayList<String>();
		list.add("삼국지");
		list.add("손자병법");
		list.add("군주론");
		map.put("감명깊게 읽은 책", list);
		return map;
	}
	
}
