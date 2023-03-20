package dao;

import model.UserModel;

public interface UserDAO {
   public abstract boolean create(UserModel um);
   
   public abstract boolean select(UserModel um);
   
   public abstract boolean view(UserModel um);
   
   public abstract boolean update(UserModel um);
   
   public abstract boolean edit(UserModel um);
}
