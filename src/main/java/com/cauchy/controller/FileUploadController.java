package com.cauchy.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
	// 处理文件上传：
	@RequestMapping("/fileUploadController")
	public Map<String,Object> fileUpload(MultipartFile fileName) throws Exception{
		System.out.println(fileName.getOriginalFilename());
		fileName.transferTo(new File("D:/"+ fileName.getOriginalFilename()));
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("msg", "OK");
		return map;
	}
}
