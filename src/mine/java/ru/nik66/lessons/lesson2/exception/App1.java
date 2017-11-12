package ru.nik66.lessons.lesson2.exception;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;

public class App1 {

    public static void main(String[] args) {
        copy("test", "temp");
    }

    public static void copy(String path1, String path2) {
        try (MyReader reader = new MyReader(path1);
             MyWriter writer = new MyWriter(path2)) {
            writer.write(reader.read());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

@Getter
@Setter
class MyReader implements AutoCloseable{

    private String path;

    public String read() throws IOException {
        if (true) {
            throw new IOException("MyReader.read()");
        }
        return "some string";
    }

    @Override
    public void close() throws Exception {
        if (true) {
            throw new IOException("MyReader.close()");
        }
    }

    public MyReader(String path) {
        setPath(path);
    }

}

@Getter
@Setter
class MyWriter implements AutoCloseable{

    private String path;

    public void write(String s) throws IOException {
        if (true) {
            throw new IOException("MyWriter.write()");
        }
    }

    @Override
    public void close() throws Exception {
        if (true) {
            throw new IOException("MyWriter.close()");
        }
    }

    public MyWriter(String path) {
        setPath(path);
    }

}