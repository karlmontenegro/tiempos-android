package com.example.isabelduninborkowski.freelo.beans;

/**
 * Created by IsabelDuninBorkowski on 13/04/16.
 */
public class Client {
    private String clientName;
    private String razSoc;
    private String ruc;

    public Client(String cN, String rS, String r) {
        this.clientName = cN;
        this.razSoc = rS;
        this.ruc = r;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getRazSoc() {
        return razSoc;
    }

    public void setRazSoc(String razSoc) {
        this.razSoc = razSoc;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
}
