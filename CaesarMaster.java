//Get Encrypted text
class Caesar{
	public static boolean isChar(char ch){
		int x=(int)ch;
		if(x>=65 && x<=90)
			return true;
		else
			return false;
	}
	
	static String generateEncryptedText(String text,int shift) {
		String str=" ";//StringBuilder str=new StringBuilder();
		for(char ch:text.toCharArray()) {
			int mappedX=0;
			if(ch==' ') {
				str=str+String.valueOf(' ');//str.append(' ');
			}
			else {
				int x=(int)ch;
				if (isChar(ch)) {
					mappedX=((x-65)+shift)%26+65;
				}
				else {
					mappedX=((x-97)+shift)%26+97;
				}
				str=str+String.valueOf((char)mappedX);//str.append((char) mappedX);
			}
		}return str; //str.toString();
	}
}
public class CaesarMaster {
		public static void main(String[] args) {
			System.out.println(Caesar.generateEncryptedText("Hi there How's you",3));
		}
}
