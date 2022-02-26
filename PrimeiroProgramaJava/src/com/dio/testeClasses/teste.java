package com.dio.testeClasses;

import com.dio.testeClasses.ClasseFilha;
import com.dio.testeClasses.ClasseMae;

public class teste {
    public static void main(String[] args) {

        ClasseMae classe1 = new ClasseFilha();

        classe1.metodo1();
        classe1.metodo2();

        ClasseFilha classe2 = new ClasseFilha();

        classe2.metodo1();
        classe2.metodo2();
    }

}
