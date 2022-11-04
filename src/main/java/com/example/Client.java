package com.example;

import com.example.gen.HelloService;
import com.example.gen.People;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class Client {

    public static void main(String[] args) throws TException{
        TTransport transport = new TSocket("localhost", 9527);
        transport.open();

        TProtocol protocol = new TBinaryProtocol(transport);
        HelloService.Client cli = new HelloService.Client(protocol);

        System.out.println("do rpc...");

        People people = cli.hello("qinchao", 18);

        transport.close();

        System.out.println("rpc done,result:" + people);
    }


}
