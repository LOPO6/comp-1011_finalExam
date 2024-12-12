package com.example.finaltestjava2024;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//Name: Logan Potopnyk

public class ApiUtility {
    public static void getCustomers(){
        //launch();
        try(
                FileReader fileReader = new FileReader("src/main/resources/customers.json");
                JsonReader jsonReader = new JsonReader(fileReader);

        ) {
            Gson gson = new Gson();
            ApiResponse apiResponse = gson.fromJson(jsonReader,ApiResponse.class);
            for(customer e: ApiResponse.Customers){
                System.out.println("Got one employee whose name is " + e.first);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
