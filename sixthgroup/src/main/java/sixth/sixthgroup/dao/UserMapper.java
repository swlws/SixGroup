package sixth.sixthgroup.dao;

import java.util.List;

import sixth.sixthgroup.model.ClassAccount;
import sixth.sixthgroup.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
	
	 /*
     * 自己添加的方法
     */
    User slectUserByNameAndPasword(User user);
    /**
     * 获取所有的班级账号
     * @return
     */
    List<ClassAccount> selectAll();
}