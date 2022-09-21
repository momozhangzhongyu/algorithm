import java.io.*;

public class Main2 {

    public static void main(String[] args) {
        File mir = new File("F://流程表单汇总//流程汇总");
        String newPath = "F://流程表单汇总//汇总//";
        String newPath2 = "F://流程表单汇总//流程表单汇总//";
        File[] list = mir.listFiles();
        for(File img : list){
            System.out.println(img.getName());
            String fileName = img.getName().substring(0, img.getName().lastIndexOf("."));
            System.out.println(fileName);
            String newFilePath = newPath + fileName + "//";
            File newMir = new File(newFilePath);
            if(!newMir.exists()) newMir.mkdir();
            File newImgFile = new File(newFilePath + fileName + ".png");
            copy(img, newImgFile);
            File xsnFile = new File(newPath2 + fileName + ".xsn");
            if(xsnFile.exists()){
                File newXsnFile = new File(newFilePath + fileName + ".xsn");
                copy(xsnFile, newXsnFile);
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
