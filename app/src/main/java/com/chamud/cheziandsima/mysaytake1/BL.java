package com.chamud.cheziandsima.mysaytake1;

import com.chamud.cheziandsima.mysaytake1.Model.Bill;
import com.chamud.cheziandsima.mysaytake1.Model.User;

import org.json.JSONObject;

/**
 * Created by CheziAndSima on 03/06/2015.
 */
public class BL {

    Communication comm;

    private final String USER_TABLE_PATH_NAME = "users/";
    private final String BILL_TABLE_PATH_NAME = "bills/";

    public BL() {
        comm = new Communication();
    }

    public User getUserByID(int id) {
        JSONObject userJson = comm.getJsonByPath(USER_TABLE_PATH_NAME + id);

        return convertJsonToUser(userJson);
    }

    public Bill getBillByID(int id) {
        JSONObject userJson = comm.getJsonByPath(BILL_TABLE_PATH_NAME + id);

        return convertJsonToBill(userJson);
    }


    private User convertJsonToUser(JSONObject userJson) {
        User u = new User();

        return u;
    }

    private Bill convertJsonToBill(JSONObject billJson) {
        Bill b = new Bill();

        return b;
    }
}
