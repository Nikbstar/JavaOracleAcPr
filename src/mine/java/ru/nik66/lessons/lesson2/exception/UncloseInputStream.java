package ru.nik66.lessons.lesson2.exception;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UncloseInputStream extends FilterInputStream {
    public UncloseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public void close() throws IOException {
        // NOP
    }
}
