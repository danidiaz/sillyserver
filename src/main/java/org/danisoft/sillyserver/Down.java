package org.danisoft.sillyserver;

import java.lang.management.ManagementFactory;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class Down 
{
    public static void main( String[] args )
    {
        try {
            Socket socket = new Socket("hostname", 1234); 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
