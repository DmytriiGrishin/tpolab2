package ru.ifmo;

import lombok.SneakyThrows;

import java.io.FileOutputStream;

public class Writer {

    FileOutputStream fileOutputStream;

    @SneakyThrows
    public Writer(String fileName){
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        this.fileOutputStream = fileOutputStream;
    }

    @SneakyThrows
    public void write(Double x, Double y){
        fileOutputStream.write((x +";"+y +"\n").getBytes());
    }

    @SneakyThrows
    public void close(){
        fileOutputStream.close();
    }
}
