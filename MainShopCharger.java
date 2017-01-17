package report1;
import java.util.*;

public class MainShopCharger{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String insertedStudentCard; //挿入された学生証
		StudentCard StudentCard1 = new StudentCard(); //学生証1
		StudentCard StudentCard2 = new StudentCard(); //学生証2
		int AcBlc;
		
		System.out.println("発行学生証枚数:" + StudentCard1.getStudentCardList().size());
		System.out.println("発行学生証枚数:" + StudentCard2.getStudentCardList().size());
		System.out.println("発行学生証枚数:" + StudentCard.getStudentCardList().size());
		
		void insertStudentCard(StudentCard cd){ //学生証の挿入
			
			System.out.println("学生証が挿入されました。");
		}
		
		void chargeMoney(int AcBlc){ //残高の追加
			System.out.println(AcBlc+"円が追加されました。");
			System.out.println("現在の残高は"+AcBlc+"円です。");
		}
		
		void printAcBlc(int AcBlc){ //残高の確認
			System.out.println(insertedStudentCard.getStudentName()+"さんの現在の");
			System.out.println("残高は"+AcBlc+"円です。");		
		}
		
	}

}
