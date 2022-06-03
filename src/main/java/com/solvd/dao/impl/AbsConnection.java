package com.solvd.dao.impl;


import com.solvd.dao.util.ConnectionPool;

import java.sql.Connection;

public class AbsConnection {
    public Connection getConnection(){return ConnectionPool.getInstance().getConnection();
    }

    public void returnConnection(Connection con){
        ConnectionPool.getInstance().returnConnection(con);
    }
}
