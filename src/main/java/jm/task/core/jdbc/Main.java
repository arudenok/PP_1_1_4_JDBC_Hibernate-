package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserDaoHibernateImpl user = new UserDaoHibernateImpl();

//        user.createUsersTable();

        user.saveUser("Name1", "LastName1", (byte) 30);
        user.saveUser("Name2", "LastName2", (byte) 25);
        user.saveUser("Name3", "LastName3", (byte) 31);
        user.saveUser("Name4", "LastName4", (byte) 38);

        user.removeUserById(2);
        System.out.println(user.getAllUsers());
//        user.cleanUsersTable();
//        user.dropUsersTable();
//        Util.closeConnection();
    }
}
