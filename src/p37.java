import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p37 {

	public static void main(String[] args) throws IOException {
		System.out.println("�п�J�^��r��");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        String stru = str.toUpperCase();
        String strl = str.toLowerCase();

        System.out.println("�ഫ���j�g�ɬ�" + stru);
        System.out.println("�ഫ���p�g�ɬ�" + strl);    
	}

}
