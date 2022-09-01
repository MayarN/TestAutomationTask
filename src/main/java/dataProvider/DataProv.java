package dataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.testng.annotations.DataProvider;

public class DataProv {
    public static String testDataRegister ="./testData/TestDataRegistration.csv";
    public static String testDataLogin ="./testData/TestDataLogin.csv";


    public static Iterator<Object []> dataProvFunc(String csvFilepath) throws IOException {

        ArrayList<Object []> parameters = new ArrayList<Object []>();
        String[] data= null;
        String line ="";
        String headerLine="";
        BufferedReader br = new BufferedReader(new FileReader(csvFilepath));
        headerLine = br.readLine();
        while ((line = br.readLine()) != null) {
            data= line.split(",");
            parameters.add(data);
        }

        return parameters.iterator();
    }

    @DataProvider(name="validRegister")
    public static Iterator<Object[]> providerValidUsers() throws IOException {

        return dataProvFunc(testDataRegister);
    }

    @DataProvider(name="validLogin")
    public static Iterator<Object[]> providerInvalidUsers() throws IOException {

        return dataProvFunc(testDataLogin);
    }
}
