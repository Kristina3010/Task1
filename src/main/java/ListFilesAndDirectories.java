import java.io.File;

public class ListFilesAndDirectories {
    public static void main(String[] args) {

        //specifikimi i path - it te directoy-s
        String directoryPath = "C:\\Users\\User\\Desktop\\myfolder";

        //krijimi objektin File
        File directory = new File(directoryPath);

        //kontrollojm nese directory ekziston dhe eshte vertet nje directory
        if (directory.exists() && directory.isDirectory()){
            //listimin e te gjitha file dhe direktorive
            String[] items = directory.list();

            if(items != null && items.length > 0 ){
                System.out.println("Files dhe directory ne " + directoryPath + " ");
                for(String item : items){
                    System.out.println(item);
                }
            }else{
                System.out.println("The directory is empty ");
            }
        } else{
            System.out.println("the path directory not exist: ");
        }

    }
}
