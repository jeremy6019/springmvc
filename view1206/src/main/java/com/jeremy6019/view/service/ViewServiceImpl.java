package com.jeremy6019.view.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ViewServiceImpl implements ViewService {

	@Override
	public List<String> fileList() {
		List<String> list = new ArrayList<>();
		//파일 목록을 가져올 디렉토리를 설정 
		File f = new File("/Users/a503-22/Downloads");
		System.err.println(f);
		//디렉토리 안의 모든 파일과 디렉토리 이름 가져오기 
		String[] s = f.list();
		//디렉토리가 아닌 이름들만 list에 추가 
		//원래는 이름을 가지고 File 객체를 만들 후 isDirectory 함수로 
		//확인을 해야하는데 알고리즘을 공부하기 위해서 아래 방법 선택 
		//확장자가 없는 것은 디렉토리 
		//.으로 시작하는 파일이나 디렉토리는 숨김이므로 제거 
		for(String temp : s) {
			if(temp.indexOf(".") > 0) {
				list.add(temp);
			}
		}
		
		return list;
	}

}
