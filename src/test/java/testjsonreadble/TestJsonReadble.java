package testjsonreadble;

import org.testng.annotations.Test;
import reader.ReadDataFromJsonFile;

import java.io.FileNotFoundException;

public class TestJsonReadble {
    ReadDataFromJsonFile readDataFromJsonFile;

    @Test
    public void test1() throws FileNotFoundException {
        readDataFromJsonFile = new ReadDataFromJsonFile();
        System.out.println(readDataFromJsonFile.readJsonFile().Login.ValidCredentials.Username);
        System.out.println(readDataFromJsonFile.readJsonFile().Login.ValidCredentials.Password);
        System.out.println(readDataFromJsonFile.readJsonFile().URL);
    }


    @Test
    public void test2() throws FileNotFoundException {
        readDataFromJsonFile = new ReadDataFromJsonFile();
        System.out.println(readDataFromJsonFile.readJsonFile().Login.InvalidCredentials.InvalidUsername.Username);
        System.out.println(readDataFromJsonFile.readJsonFile().Login.InvalidCredentials.InvalidUsername.Password);
    }


    @Test
    public void test3() throws FileNotFoundException {
        readDataFromJsonFile = new ReadDataFromJsonFile();
        System.out.println(readDataFromJsonFile.readJsonFile().Login.InvalidCredentials.InvalidPassword.Username);
        System.out.println(readDataFromJsonFile.readJsonFile().Login.InvalidCredentials.InvalidPassword.Password);
    }



}
