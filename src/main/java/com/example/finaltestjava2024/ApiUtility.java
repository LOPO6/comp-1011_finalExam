package com.example.finaltestjava2024;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//Name: Logan Potopnyk

public class ApiUtility {

    public static void getCustomers(){
        ArrayList<customer> customers = new ArrayList<>();
        //launch();
        try(
                FileReader fileReader = new FileReader("src/main/resources/customers.json");
                JsonReader jsonReader = new JsonReader(fileReader);

        ) {
            Gson gson = new Gson();
            ApiResponse customerResponse = gson.fromJson(jsonReader,ApiResponse.class);
            for(customer e: customerResponse.Customers){
                //add each employees info to an employee, then add employee into the company
                customers.add(e);


            }




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
