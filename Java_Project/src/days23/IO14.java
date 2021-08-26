package days23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO14 {

	public static void main(String[] args) throws IOException {
		// "D:\\학원\\변혜지"폴더 안의 "eclipse-inst-jre-win64.exe"파일을
		// "D:\학원\변혜지\workspaces\copy"폴더로 복사 
		
		String OriginalDirPath ="D:\\학원\\변혜지";
		String CopyDirPath = "D:\\학원\\변혜지\\workspaces\\copy";
		String FileName = "eclipse-inst-jre-win64.exe";
				
				File dir = new File(OriginalDirPath);
				File file_original = new File(dir, FileName);
				// 원본파일의 경로와 파일명 설정
				
				File dir_copy = new File(CopyDirPath);
				if( !dir_copy.exists() ) dir_copy.mkdirs();
				File file_copy = new File(dir_copy, FileName);
				// 사본 파일의 경로와 파일명 설정
				
				BufferedInputStream bis
				= new BufferedInputStream (new FileInputStream(file_original));
				
				BufferedOutputStream bos
				= new BufferedOutputStream (new FileOutputStream(file_copy));
				
				byte [] data = new byte[1024];
				int size;
				while((size = bis.read(data)) != -1) bos.write(data, 0, size);
				// 읽어온 크기만큼 파일에 출력
				bis.close();
				bos.close();
	}

}
