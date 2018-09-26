package com.sandylab.kasku.realm;

import io.realm.RealmObject;

/**
 * Created by Sandy Rizky on 30/08/2018.
 */

public class Transaction extends RealmObject {
    int Id;
    String Date;
    long Amount;
    int Type;
    String Desc;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public long getAmount() {
        return Amount;
    }

    public void setAmount(long amount) {
        Amount = amount;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
