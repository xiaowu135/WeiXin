package org.xiaowu.file.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;



/**
 * 测试将D盘下面的source文件夹下面的文件，全部复制到G盘source.zip文件里面去<br>
 * 直接将文件夹下面的文件进行压缩处理<br>
 * 
 * @author WQ
 *
 */
public class FileTest {
	 public static void main(String[] args) throws Exception{
	        dirZipCopy("D:/source","G:/source.zip");
	    }
	    /**
	     * 文件夹压缩备份
	     * @param fromDir 要压缩备份的文件夹
	     * @param toDir 压缩至的路径
	     * @throws Exception
	     */
	    public static void dirZipCopy(String fromDir,String toDir) throws Exception{
	        //创建ZIP输出流
	        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(toDir));
	        //递归处理文件夹
	        zipCopy(new File(fromDir),zos,"");
	        zos.close();
	    }
	    /**
	     * 压缩复制文件
	     * @param fromDir 要压缩的文件
	     * @param zos ZIP输出流
	     * @param path 相对于ZIP文件的路径
	     * @throws Exception
	     */
	    private static void zipCopy(File fromDir,ZipOutputStream zos,String path) throws Exception{
	        if(fromDir.exists()){
	            if(fromDir.isDirectory()){
	                path += fromDir.getName()+"/";
	                zos.putNextEntry(new ZipEntry(path));
	                File[] files=fromDir.listFiles();
	                if(files != null){
	                    for(int i=0;i<files.length;i++){
	                        zipCopy(files[i],zos,path);
	                    }
	                }
	            }else{
	                //putNextEntry():开始写入新的 ZIP 文件条目并将流定位到条目数据的开始处。
	                zos.putNextEntry(new ZipEntry(path+fromDir.getName()));
	                InputStream is=new FileInputStream(fromDir);
	                int len=0;
	                byte[] b=new byte[1024];
	                while((len=is.read(b))!=-1){
	                    zos.write(b,0,len);
	                    zos.flush();
	                }
	                is.close();
	            }
	        }
	    }
}
