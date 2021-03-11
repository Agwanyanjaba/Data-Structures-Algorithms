//@author wycliffe
package com.wycliffe.cassandra;

import com.datastax.driver.core.Session;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;

public class ReadData {
    //main method
    public static void main(String ... args){
        //query
        String query = "SELECT * from wybosoft_emp";
        //create Cluster
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        //create Session object to connect to database
        Session session = cluster.connect("wybosoftdb");
        
        //create resultset object to read data
        ResultSet resultSet = session.execute(query);
        System.out.println(resultSet.all());
    }
}
