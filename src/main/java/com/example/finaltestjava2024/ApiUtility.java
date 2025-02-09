package com.example.finaltestjava2024;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
//Name: Logan Potopnyk
//student number: 1226100

public class ApiUtility {

    public static ArrayList<customer> getCustomers(){
        ArrayList<customer> customers = new ArrayList<>();
        //launch();
        try(
                FileReader fileReader = new FileReader("src/main/resources/customers.json");
                JsonReader jsonReader = new JsonReader(fileReader);

        ) {
            Gson gson = new Gson();
            ApiResponse customerResponse = gson.fromJson(jsonReader,ApiResponse.class);
            //add each employees info to an employee, then add employee into the company
            customers.addAll(customerResponse.Customers);




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customers;

    }
    public static ArrayList<customer> getCanadaCustomers(){
        ArrayList<customer> customers = new ArrayList<>();
        //launch();
        try(
                FileReader fileReader = new FileReader("src/main/resources/customers.json");
                JsonReader jsonReader = new JsonReader(fileReader);

        ) {
            Gson gson = new Gson();
            ApiResponse customerResponse = gson.fromJson(jsonReader,ApiResponse.class);
            //add each employees info to an employee, then add employee into the company
            for(customer e: customerResponse.Customers){
                if (Objects.equals(e.country, "Canada")){
                    customers.add(e);
                }
            }




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customers;

    }

}
