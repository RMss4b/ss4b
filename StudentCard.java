package report1;
import java.util.*;

public class StudentCard {

	String stnum; //学籍番号
	String name; //名前
	int AcBlc; //残高
	
	List<StudentCard> CardList = new ArrayList<StudentCard>(); //学生証のリスト
	
	String getStudentName(String name){	 //名前の取得
		return name;
	}
	
	int getAcBlc(int AcBlc){ //残高の取得
		return AcBlc;
	}
	
	List<StudentCard> getStudentCardList(){
		return CardList;
	}
	
}
