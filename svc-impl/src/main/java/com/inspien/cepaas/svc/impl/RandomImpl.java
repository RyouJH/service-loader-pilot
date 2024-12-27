package com.inspien.cepaas.svc.impl;

import com.inspien.cepaas.svc.api.RandomInt;

import java.security.SecureRandom;

public class RandomImpl implements RandomInt {
    private SecureRandom r = new SecureRandom();

    @Override
    public int random() {
        System.out.println("Impl");
        return r.nextInt(10);
    }
}
