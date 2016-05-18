package mmm;

import java.util.ArrayList;
import java.util.List;

public class RecordMaker {
	public static void printList(List<Integer> empList){
		for(int empListNum : empList){
			System.out.print("NT");
			int randomEmployeeNum = empListNum;
			int randomScore = (int)(Math.random()*100); 
			System.out.println(replaceEmpNum(randomEmployeeNum) + " " + randomScore);
		}
	}
	
	public static String replaceEmpNum(int empNum){
		if(empNum < 10 ){
			return "0000" + Integer.toString(empNum);
		} else if(empNum < 100){
			return "000" + Integer.toString(empNum);
		} else if(empNum < 1000){
			return "00" + Integer.toString(empNum);
		} else if(empNum < 10000){
			return "0" + Integer.toString(empNum);
		} else {
			return Integer.toString(empNum);
		}
	}
	
	
	public static List<Integer> getRandomEmployeeNum(int countNum){
		List<Integer> empList = new ArrayList<Integer>();
		while(true){
			int randomNum = (int)(Math.random()*10);
			if(!empList.contains(randomNum)){
				empList.add(randomNum);
			}
			if(empList.size()==countNum){
				return empList;
			}
		}
	}
	
	public static void main(String[] args) {
		int countNum = Integer.parseInt(args[0]);
		List<Integer> empList = getRandomEmployeeNum(countNum);
		printList(empList);
	}
}


/*<2012> 프로그래밍언어기초 A+, 프로그래밍언어응용 A+, 디지털논리회로 A
<2013> 자료구조 A+, 데이터베이스 A+, 객체지향프로그래밍(C++) B+
<2014> 객체지향프로그래밍(JAVA) A+, 고급웹프로그래밍 B+
*/