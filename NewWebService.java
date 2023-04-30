/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Vishnu
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "operation")
    public String operation(@WebParam(name = "name") String name, @WebParam(name = "pass") String pass) {
        //TODO write your implementation code here:
        boolean flag=false;
        try{
            Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/ebookshop");
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery("select * from confirm");
            while(rs.next()){
                String name1=rs.getString("username");
                String pass1=rs.getString("password");
                if(name1.equals(name) && pass1.equals(pass)){
                    flag=true;
                    break;
                }
            }
            c.close();
            if(flag)
                return "true";
            else
                return "false";
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
      
    }
}
