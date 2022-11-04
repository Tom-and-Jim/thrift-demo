package com.example;

import com.example.gen.HelloService;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

public class Server {

    public static void main(String[] args) throws TTransportException {
        TServerTransport serverTransport = new TServerSocket(9527);
        TSimpleServer ser = new TSimpleServer(new TServer.Args(serverTransport)
                .processor(new HelloService.Processor<>(new HelloServiceImpl())));

        System.out.print("Starting the server... ");
        ser.serve();
        System.out.println("done.");
    }
}
