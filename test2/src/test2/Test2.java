package test2;

import java.text.ParseException;

public class Test2 {

	public static void main(String[] args) throws ParseException {
		StringBuffer strbuf = new StringBuffer(" AND SHIPPING");
		strbuf.delete(0, 5);	// ANDを削除
		strbuf.insert(0, " WHERE ");	// WHEREを追加

		System.out.println(strbuf);

	}
}
