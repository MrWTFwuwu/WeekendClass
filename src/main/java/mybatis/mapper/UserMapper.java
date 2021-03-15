package mybatis.mapper;

import mybatis.dao.User;

public interface UserMapper {
    User selectUser(String id);
}
