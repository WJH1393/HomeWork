package HW1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*��D���µ�CopyTarget1�µ��ļ����Ƶ�CopyTarget2�£����ֽ����ķ�ʽ��������*/
public class Copy {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*���ֽ�������һ���ļ�*/
		File file1 = new File("D:/CopyTarget1/Array.java");
		FileInputStream is = new FileInputStream(file1);
		byte[] b =new byte[(int) file1.length()];
		is.read(b);
		is.close();
		System.out.println(new String(b));
		/*�ֽ���������ļ�*/
		File file2 = new File("D:/CopyTarget2/Array.java");
		FileOutputStream os = new FileOutputStream(file2);
		os.write(b);
		os.close();
		System.out.println("���Ƴɹ�");
	}

}
