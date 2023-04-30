/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vishnu
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(operation("radha","123"));
        System.out.println(operation("sri","123"));
    }

    private static String operation(java.lang.String name, java.lang.String pass) {
        webservice.NewWebService service = new webservice.NewWebService();
        webservice.NewWebService port = service;
        return port.operation(name, pass);
    }
    
}
