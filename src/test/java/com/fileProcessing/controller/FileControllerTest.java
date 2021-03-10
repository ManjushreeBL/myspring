package com.fileProcessing.controller;

import com.fileprocessing.controller.FileController;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FileControllerTest {
    FileController fileController=new FileController();
    @Test
    public void printInputFile() throws IOException {
        assertNotNull(fileController.getFile(Path.of("/file.txt")));
        System.out.println(fileController.getFile(Path.of("/file.txt")));
    }
}
