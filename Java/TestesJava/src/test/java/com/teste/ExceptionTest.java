package com.teste;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExceptionTest {
    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){
        //new ArrayList<Object>().get(0);
        List<String> lista = new ArrayList<String>();
        lista.add("Alex");
        lista.get(1);

    }
}
