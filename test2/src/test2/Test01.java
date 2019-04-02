package test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) throws ParseException {
//        String dateStr = "20190311112055";
        String dateStr = "20190311112055";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

        Date formatDate = sdf.parse(dateStr);

		System.out.println(formatDate);

		sdf.applyPattern("yyyy/MM/dd HH:mm");

		String ret = sdf.format(formatDate).toString();

		System.out.println(ret);

	}
}
