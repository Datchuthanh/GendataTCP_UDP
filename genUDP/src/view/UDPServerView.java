/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.*;
/**
 *
 * @author Ryan
 */
public class UDPServerView {
    public static void main(String[] args) {
        UDPServer server = new UDPServer();
        System.out.println("Server UDP is running");
        server.listening();
    }
}
