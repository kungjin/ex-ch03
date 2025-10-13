package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ExService {
	private static final Logger log = LoggerFactory.getLogger(ExService.class);
	
	public String sayHello(String hi) {
		String msg = hi + "좋은랄";
		System.out.println(msg);
		log.info(msg);
		log.debug(msg);
		return hi;
	}

	public String ex321() {
		int number = 1;
		String result = "";
		
        if (number == 1) {
           result = "if 블록입니다.";
        } else if (number == 2) {
           result = "else if 블록입니다.";
        } else {
        	result = "else 블록입니다.";
        }
        log.info(result);
		return result;
	}

	public String ex322() {
		int[] array = {1,2,3,4,5};
		String result= "";
		
		for (int i = 0; i < array.length; i++) {
			result += ("i = "+ array[i]+ "<br>");
		}
		log.info(result);
		return result;
	}
		

	public String ex323() {
		int[] array = {1,2,3,4,5};
		int i = 0;
		String result = "";
		
		while (i< array.length) {
			result += array[i] + "";
			i++;
		}
		 log.info(result);
		return result;
	}
	public interface Car{
		void start();
		void drive();
		void stop();
	}
	public class Sonata implements Car{
		public Sonata() {
			log.info("== 출고 == Sonata");
			}
		@Override
		public void start() {
			log.info("Sonata 시동을 켭니다.");
		}
		@Override
		public void drive() {
			 log.info("Sonata 부드럽게 주행 중...");
		}
		@Override
		 public void stop() {
	            log.info("Sonata 정차합니다.");
	        }
	}
	
	
	public class K5 implements Car{
		public K5() {
		log.info("== 출고 == K5");
		}
		@Override
		public void start() {
			log.info("K5 시동 ON!");
		}
		@Override
		public void drive() {
            log.info("K5 스포티하게 주행 중!");
        }
		@Override
		 public void stop() {
	            log.info("K5 브레이크 작동, 정차 완료.");
	        }
		
	}
	public String ex324() {
	
		Car car1 = new Sonata();
		Car car2 = new K5();
		
			car1.start();
	        car1.drive();
	        car1.stop();

	        car2.start();
	        car2.drive();
	        car2.stop();

	        return "두 대의 차량을 출고하고 주행 테스트 완료.";
	}

	public String ex325() {
		List<Integer> list = new ArrayList<>();
		
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		Integer result = list.get(1);
		return String.valueOf(result);
	}

	public String ex326() {
		List<String> list = new ArrayList<>();
		String result = "";
		
		list.add("public");
		list.add("static");
		list.add("void");
		
		for(int i = 0; i<list.size(); i++) {
			result += list.get(i)+ "<br>";
		}
		
		list.remove(1);
		
		int voidIndex = list.indexOf("void");
		
		result +=  "void의 index = " + voidIndex;
		return result;
	}

	public String ex327() {
		String str1 = new String("is same?");
		String str2 = new String("is same?");
		String result = "";
		
		result = "결과 : " + (str1 == str2); 
		
		log.info("str1 == str2" );
		return result;
	}

	
	
}