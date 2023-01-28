package utils.dry;

import java.util.List;

public class UserRepository {
    public List<User> getAllUsers() {
        SimpleSqlGenerator simpleSqlGenerator = new SimpleSqlGenerator();
        String sql = "select * from users";
        return simpleSqlGenerator.generate(sql);
    }

    public User getFirstUser() {
        SimpleSqlGenerator simpleSqlGenerator = new SimpleSqlGenerator();
        String sql = "select * from users";
        return simpleSqlGenerator.generate(sql).get(0);
    }
}
