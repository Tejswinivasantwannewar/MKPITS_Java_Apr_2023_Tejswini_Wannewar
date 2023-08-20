import java.io.File;

public class InputOutputMethods {
    public static void main(String[] args) {


     System.out.println("-------To check the file bye providing the path/of that file or folder --------");
    File f=new File("xyz.txt");
        System.out.println(f.exists());  //to check file is exist  in our current folder .
        System.out.println(  f.getAbsoluteFile()); //to check folder


        System.out.println("-----------To check the file from mentioned folder --------------");
    File ff=new File("E:\\Java_programs" , "Float.java");
        System.out.println(ff.exists());

        System.out.println("-------to check the list of mentioned folder----------");

    File fff=new File("E:\\Java_programs"); //
        System.out.println(fff.exists());
    String[] files= fff.list(); //Returns an array of strings naming the files and directories in the directory denoted by this abstract pathname.
        for(String fn:files){  // for each loop to show the list of provided  path name .
        System.out.println(fn);
    }


        System.out.println("-----checking file from an already mentioned folder ----");
    File fd=new File(fff,"Float.java");
        System.out.println(fd.exists());

        System.out.println("--------compare to method---------");
    File compare=new File("E:\\Java_programs");
        System.out.println(compare.compareTo(new File("Float.java")));

        System.out.println("------to get file name -----------");
    File directory=new File("Float.java");
        System.out.println(directory.getName());


        System.out.println("-------get parent name--------");
    File parent = new File("E:\\Java_programs");
        System.out.println(  parent.getParent());


        System.out.println("-----listfiles method returtn files array -----------");
    File listFiles=new File("E:\\Java_programs");//Returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname.
    File[] list =listFiles.listFiles();
         for( File li:list){
        System.out.println(li);
    }

        System.out.println("--------canexecute returns file is excecutable or not ----------");
    File execute=new File("E:\\Java_programs");
        System.out.println(execute.canExecute());// Tests whether the application can execute the file denoted by this abstract pathname.


        System.out.println("---------hashCode Method -----------------");
    File hascode=new File("E:\\Java_programs");
        System.out.println(   hascode.hashCode()); //Computes a hash code for this abstract pathname.


        System.out.println("------------last modified --------");
    File lastModified=new File("E:\\Java_programs");
        System.out.println(lastModified.lastModified());//Returns the time that the file denoted by this abstract pathname was last modified.
        System.out.println(lastModified.setLastModified(44444444));
        System.out.println(lastModified); //If we set the lastmodified then it doesnot return long number what you set then it returns bollean value.



        System.out.println("---------getToatlSpace--------------");
    //Returns the size of the partition named by this abstract pathname.
    File getTotalSpace=new File("E:\\Java_programs");
        System.out.println(getTotalSpace.getTotalSpace());


        System.out.println("-----------setRedable--------------");
    File setReadable=new File("E:\\Java_programs");
        System.out.println(setReadable.setReadable(true,false));

        System.out.println("---------------isHidden method----------------");
        File hidden = new File("E:\\Java_programs");
        System.out.println(hidden.isHidden());
    }


}

