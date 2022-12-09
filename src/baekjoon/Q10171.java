package baekjoon;

public class Q10171 {

	public static void main(String[] args) {
		
		// 백슬래쉬 넣으려면 하나 더 붙여서 넣어야 함
		// (큰따옴표 작은 따옴표도 마찬가지임)
		//System.out.print("\\    /\\\n");
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\\    /\\\n");
		sb.append(" )  ( ')\n");
		sb.append("(  /  )\n");
		sb.append(" \\(__)|\n");
		
		System.out.println(sb);
	}

}
