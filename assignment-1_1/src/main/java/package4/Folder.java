package main.java.package4;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String folderName;
    private List<File> files;
    private List<Folder> subFolders;

    public Folder(String folderName){
        this.folderName = folderName;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public String getFolderName() {return folderName;}
    public List<File> getFiles() {return files;}
    public List<Folder> getSubFolders() {return subFolders;}
    
    public void setFolderName(String folderName) {this.folderName = folderName;}
    public void setFiles(List<File> files) {this.files = files;}
    public void setSubFolders(List<Folder> subFolders) {this.subFolders = subFolders;}

    public void addFile(File file){files.add(file);}
    public void addSubFolder(Folder subFolder){subFolders.add(subFolder);}
    
    public void delete(){
        for (File file: files){
            System.out.println("Deleting file: " + file.getFileName());
        }
        files.clear();

        for (Folder subFolder: subFolders){
            System.out.println("Deleteing folder: " + subFolder.getFolderName());
            subFolder.delete();
        }
        subFolders.clear();

        this.files.clear();
        this.subFolders.clear();

        // Added this method to also remove folder itself
        removeFromParent(this);
    }

    public void print(){
        System.out.println("Folder: " + folderName);
        for (File file: files){
            file.print();
        }
        for (Folder subFolder: subFolders){
            subFolder.print();
        }
    }

    private void removeFromParent(Folder folder){
        if (parent != null){
            parent.subFolders.remove(folder);
        }
    }

    // added this portion to keep track of parent
    private Folder parent;
    public Folder getParent() {return parent;}
    public void setParent(Folder parent) {this.parent = parent;}
}