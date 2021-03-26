package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {
    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void shouldCreateANewFileInTemporaryFolder(){
        File created = null;
        try {
            created = tmpFolder.newFile("file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(created.isFile());
        assertEquals(tmpFolder.getRoot(),created.getParentFile());
    }
}
