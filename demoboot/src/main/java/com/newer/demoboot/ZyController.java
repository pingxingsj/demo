package com.newer.demoboot;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 	作业controller
 * @author 张磊磊
 *
 */
@Controller
public class ZyController {
	
	@GetMapping("/")
	public  HashMap<String,Object> home(){
		HashMap<String, Object> map = new HashMap<>();
		
		
		
		return null;
	}
	@GetMapping("bir/{year}/{month}/{day}")
	public HashMap<String,Object> aa(
			@PathVariable int year,
			@PathVariable int month,
			@PathVariable int day){
		return birthday(year,month,day);
	}
	@GetMapping("/birthday")
	@ResponseBody
	public  HashMap<String,Object> birthday(int year,int month,int day){
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("constellation", birthday(month,day));
		System.out.println((year%2020)%12);
		
		
		return null;
	}
	
	private String birthday(int month,int day) {
		String constellation = "";
		//进入月份判断   在判断天数
		switch (month) {
		case 1:
			constellation = day  >= 20 ? "水平座" : "摩羯座";
			break;
		case 2:
			constellation = day  >= 19 ? "双鱼座" : "水平座";
			break;
		case 3:
			constellation = day  >= 21 ? "白羊座" : "双鱼座";
			break;
		case 4:
			constellation = day  >= 20 ? "金牛座" : "白羊座";
			break;
		case 5:
			constellation = day  >= 21 ? "双子座" : "金牛座";
			break;
		case 6:
			constellation = day  >= 22 ? "巨蟹座" : "双子座";
			break;
		case 7:
			constellation = day  >= 23 ? "狮子座" : "巨蟹座";
			break;
		case 8:
			constellation = day  >= 23 ? "处女座" : "狮子座";
			break;
		case 9:
			constellation = day  >= 23 ? "天平座" : "处女座";
			break;
		case 10:
			constellation = day  >= 24 ? "天蝎座" : "天平座";
			break;
		case 11:
			constellation = day  >= 23 ? "射手座" : "天蝎座";
			break;
		case 12:
			constellation = day  >= 22 ? "摩羯座" : "射手座";
			break;
		default:
			break;
		}
		//输出星座结果
		System.out.println(month+"月"+day+"日是" +constellation);
		return constellation;
	}

}
