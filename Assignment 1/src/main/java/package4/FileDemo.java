package main.java.package4;

public class FileDemo {
    public static void main(String[] args) {
        Folder phpDemo1 = new Folder("php_demo1");

        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder("phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        File htaccess = new File(".htaccess");
        File indexhtrouter = new File(".htrouter.php");
        File indexHtml = new File("index.html");

        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        phpDemo1.addSubFolder(sourceFiles);
        phpDemo1.addSubFolder(includePath);
        phpDemo1.addSubFolder(remoteFiles);

        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        app.setParent(sourceFiles);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);
        publicFolder.setParent(sourceFiles);
        
        
        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);

        publicFolder.addFile(htaccess);
        publicFolder.addFile(indexhtrouter);
        publicFolder.addFile(indexHtml);

       // Print out php and all its subfolders
       phpDemo1.print();
       System.out.println("--------------------------");

       // Delete 'app' and print
       app.delete();
       phpDemo1.print();
       System.out.println("--------------------------");

       // Delete 'public' and print
        publicFolder.delete();
        phpDemo1.print();
    }
}
