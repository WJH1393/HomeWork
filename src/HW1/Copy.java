package HW1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*把D盘下的CopyTarget1下的文件复制到CopyTarget2下，用字节流的方式所做如下*/
public class Copy {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*用字节流读入一个文件*/
		File file1 = new File("D:/CopyTarget1/Array.java");
		FileInputStream is = new FileInputStream(file1);
		byte[] b =new byte[(int) file1.length()];
		is.read(b);
		is.close();
		System.out.println(new String(b));
		/*字节流输出该文件*/
		File file2 = new File("D:/CopyTarget2/Array.java");
		FileOutputStream os = new FileOutputStream(file2);
		os.write(b);
		os.close();
		System.out.println("复制成功");
	}

}
