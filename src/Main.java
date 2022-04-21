import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("F://test");
        String newPath = "F://test2//";
            File[] list = file.listFiles();
            for(File file1 : list){
//                System.out.println(file1.getName());
                    File[] subFile = file1.listFiles();
                    if(subFile.length > 1){
                        System.out.println(file1.getName());
                    }
                    for(File file2 : subFile){
                        String fileName = file2.getName();
                        String fileNewName = newPath + file2.getName() + ".png";
                        File file4 = new File(fileNewName);
//                        System.out.println(file2.getName());
                        File[] subFile2 = file2.listFiles();
                        for(File file3 : subFile2){
                            if(file3.getName().endsWith("png")){
//                                System.out.println(file3.getName());
//                                copy(file3, file4);
                            }

                        }
                    }
            }
    }

    /**
     *
     * @param oldFile
     * @param newFile
     */
    public static void copy(File oldFile, File newFile){
        try (InputStream in = new FileInputStream(oldFile);
             OutputStream out = new FileOutputStream( newFile )) {
            byte[] arr = new byte[1024];
            int len;
            while ((len = in.read( arr )) != -1){
                out.write ( arr, 0, len );
            }
        }catch (Exception e){
            e.printStackTrace ();
        }
    }

}
