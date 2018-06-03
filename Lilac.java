package com.company;

public class Lilac {

    public static void main(String[] args) {
        //Tests to make sure it generates new and randomized hashes
        LilacBlock genesisBlock = new LilacBlock("This is the first block", "0");
        System.out.println("Hash for block 1: " + genesisBlock.hash);

        LilacBlock secondBlock = new LilacBlock("This is the second block", genesisBlock.hash);
        System.out.println("Hash for block 2: " + secondBlock.hash);

        LilacBlock thirdBlock = new LilacBlock("This is the third block", secondBlock.hash);
        System.out.println("Hash for block 3: " + thirdBlock.hash);
    }
}
