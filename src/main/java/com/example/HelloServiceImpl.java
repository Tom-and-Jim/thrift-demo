package com.example;

import com.example.gen.HelloService;
import com.example.gen.People;
import org.apache.thrift.TException;

public class HelloServiceImpl implements HelloService.Iface{

    @Override
    public People hello(String name, int age) throws TException {
        return new People(name, age);
    }
}
