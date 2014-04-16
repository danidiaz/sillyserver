package org.danisoft.sillyserver;

import java.lang.management.ManagementFactory;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class Up 
{
    public static void main( String[] args )
    {
        try {
                final ServerSocket serverSocket = new ServerSocket(1234);

                System.out.println("Servert started with arguments:");
                
                for (String msg : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
                    System.out.println(msg);
                }

                Socket  clientSocket = serverSocket.accept();
                 
                System.out.println("Server succesfully stopped.");
                
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
