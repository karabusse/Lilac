package com.company;

import java.util.Date; //Provides date/time information

public class LilacBlock {

    public String hash;
    public String previousHash;
    private String data; //data held within block
    private long timeStamp; //number of milliseconds since 1/1/1970

    /**
     * Lilac Block Constructor
     * @param data
     * @param previousHash
     */
    public LilacBlock(String data, String previousHash) {

        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        String calculatedHash = StringUtil.applySha256(previousHash + Long.toString(timeStamp) + data);
        return calculatedHash;
    }

}
