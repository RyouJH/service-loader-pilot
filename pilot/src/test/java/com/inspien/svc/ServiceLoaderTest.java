package com.inspien.svc;

import com.inspien.cepaas.svc.api.RandomInt;
import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

public class ServiceLoaderTest {
    @Test
    public void test() {
        ServiceLoader<RandomInt> loader = ServiceLoader.load(RandomInt.class);
        Iterator<RandomInt> iterator = loader.iterator();
       while (iterator.hasNext()){
           RandomInt r = iterator.next();
           System.out.println(r.random());
       }
    }
}

