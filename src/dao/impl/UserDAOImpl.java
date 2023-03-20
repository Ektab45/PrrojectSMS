package dao.impl;

import dao.UserDAO;
import model.UserModel;


public  class UserDAOImpl implements UserDAO{

    @Override
    public boolean create(UserModel um) {
        return true;
        }

    @Override
    public boolean select(UserModel um) {
       return true; 
    }

    @Override
    public boolean view(UserModel um) {
        return true;
    }

    @Override
    public boolean update(UserModel um) {
        return true;
    }

    @Override
    public boolean edit(UserModel um) {
         return true;
    }

    
}
