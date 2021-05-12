package DataAccess.concretes;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    public List<User> users = new ArrayList<User>(); //Bir liste oluşturuyoruz ve kullanıcılarımızın bilgilerini bu listeye ekliyoruz.

    @Override
    public void add(User user) {
        this.users.add(user);
        System.out.println(user.getFirstName() + " " + user.getLastName() + " added to database");

    }

    @Override
    public void delete(User user) {
        this.users.remove(user);
        System.out.println(user.getFirstName() + " " + user.getLastName() + " deleted from database");

    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public boolean mailExist(User user) {
        for (User member: users){
            if(member.getMail() == user.getMail()){
                return false;
            }
        }
        return true;
    }
}
