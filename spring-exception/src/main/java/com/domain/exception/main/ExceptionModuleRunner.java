package com.domain.exception.main;

import com.domain.exception.io.FileReader;
import com.domain.exception.io.FileReaderException;

/**
 * @author mbaranowicz
 */
public class ExceptionModuleRunner {

    public static void main(String[] args){
        FileReader fileReader = new FileReader();

        try{
            fileReader.readFile();
        } catch(FileReaderException e){
            System.out.println("Problem while ");
        }
    }
}
