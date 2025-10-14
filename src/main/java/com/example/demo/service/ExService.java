package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.Comparator;

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
		int[] array = { 1, 2, 3, 4, 5 };
		String result = "";

		for (int i = 0; i < array.length; i++) {
			result += ("i = " + array[i] + "<br>");
		}
		log.info(result);
		return result;
	}

	public String ex323() {
		int[] array = { 1, 2, 3, 4, 5 };
		int i = 0;
		String result = "";

		while (i < array.length) {
			result += array[i] + "";
			i++;
		}
		log.info(result);
		return result;
	}

	public interface Car {
		void start();

		void drive();

		void stop();
	}

	public class Sonata implements Car {
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

	public class K5 implements Car {
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

		for (int i = 0; i < list.size(); i++) {
			result += list.get(i) + "<br>";
		}

		list.remove(1);

		int voidIndex = list.indexOf("void");

		result += "void의 index = " + voidIndex;
		return result;
	}

	public String ex327() {
		String str1 = new String("is same?");
		String str2 = new String("is same?");
		String result = "";

		result = "결과 : " + (str1 == str2);

		log.info("str1 == str2");
		return result;
	}

	public String ex328() {
		String str1 = new String("is same?");
		String str2 = new String("is same?");
		boolean result = str1.equals(str2);

		log.info("문자열 비교 결과: {}", result);

		return "결과 : " + result;
	}

	public String ex331() {
		List<String> list = new ArrayList<>();

		list.add("public");
		list.add("static");
		list.add("List");

//		익명의 클래스 코드 
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.compareTo(str2);
			}
		});

		// 람다식 표현식 코드
		list.sort((Comparator<String>) (str1, str2) -> str1.compareTo(str2));

		String result = String.join(", ", list);
		log.info("정렬결과", result);
		return result;
	}

	public String ex332() {
		List<String> list = new ArrayList<>();

		list.add("public");
		list.add("static");
		list.add("List");

		list.stream().forEach(str -> System.out.println(str));

		String result = String.join("<br>", list);

		log.info("리스트 행렬 결과", result);
		return result;
	}

	public String ex333() {
		Integer[] IntegerArray = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.asList(IntegerArray);
		List<Integer> evenList = new ArrayList<>();
		String result = "";

		for (int i = 0; i < list.size(); i++) {
			Integer number = list.get(i);
			if (number % 2 == 0) { // 2로 나눴을 때의 나머지가 0이면 2의 배수이다.
				evenList.add(number);
			}
		}
		for (int i = 0; i < evenList.size(); i++) {
			System.out.println(evenList.get(i));
			result += evenList.get(i);
			if (i < evenList.size() - 1) {
				result += "<br>";
			}

		}

		log.info("for문 결과: {}", result);
		return result;
	}

	public String ex334() {
		Integer[] integerArray = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.asList(integerArray);

		String result = Arrays.stream(integerArray)
				.filter(value -> value % 2 == 0)
				.peek(System.out::println)
				.map(String::valueOf)
				.collect(Collectors.joining("<br>"));

		log.info("스트림 API 결과값 {}", result);
		return result;
	}

	public String ex335() {
		Integer[] integerArray = new Integer[] {1,2,3,4,5};
		List<Integer> list = Arrays.asList(integerArray);
		
		String result = list.stream()
				.map(String::valueOf)
	            .collect(Collectors.joining("<br>"));
		
		list.forEach(System.out::println);
	
		log.info("forEach 구문 결과값 : {}", result);
		return result;
	}

	public String ex336() {
		Integer[] integerArray = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list = Arrays.asList(integerArray);
		List<Integer> evenList = list.stream()
	            .filter(v -> v % 2 == 0)
	            .collect(Collectors.toList());
		
		String result = evenList.stream()
	            .map(String::valueOf)
	            .collect(Collectors.joining("<br>"));
		
		log.info("filter 결과값 : {}", result);
		return result;
	}

	public String ex337() {
		 Integer[] integerArray = {1,1,1,1,2,2,2,3,3,4}; // new 객체 축약 문법 

		    String result = Arrays.stream(integerArray)
		            .distinct()                       // 중복 제거 (원본 순서 유지)
		            .peek(v -> log.info("distinct: {}", v)) // 로그로 하나씩 표기
		            .map(String::valueOf)             // 화면용 문자열로 변환
		            .collect(Collectors.joining("<br>")); // 줄바꿈 구분으로 합치기

		    log.info("distinct summary (count={}): {}", 
		             result.split("<br>").length, result);

		    return result; // 화면: 1<br>2<br>3<br>4
		    // 지피티가 제시한 좀 더 간단한 방법 활용 
	}

	public String ex338() {
		String[] lowercaseArray = {"public", "static" , "void"};
		List<String> lowercaseList = Arrays.asList(lowercaseArray);
		
		List<String> uppercaseList = lowercaseList.stream()
		            .map(s -> s.toUpperCase(Locale.ROOT))
		            .toList();
		
		 String result = String.join("<br>", uppercaseList);
		
		log.info("ex338 result: {}",result);
		return result;
	}
	
	
	
	
	
}