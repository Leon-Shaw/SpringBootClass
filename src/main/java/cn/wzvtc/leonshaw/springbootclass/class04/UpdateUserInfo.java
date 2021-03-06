package cn.wzvtc.leonshaw.springbootclass.class04;

import cn.wzvtc.leonshaw.springbootclass.class03.Account;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/class04")
public class UpdateUserInfo {
    Map<String, Account> users = new HashMap();

    @RequestMapping("/register")
    public String register(@RequestParam(defaultValue = "LeonShaw") String username, @RequestParam(defaultValue = "123456") String password, @RequestParam(defaultValue = "男") String sex, @RequestParam(defaultValue = "12345678901") String phonenumber) {
        Account user = new Account();
        user.setUsername(username);
        user.setPassword(password);
        user.setSex(sex);
        user.setPhonenumber(phonenumber);
        users.put(username, user);
        return "插入用户成功";
    }

    @RequestMapping("/selectUserInfo")
    public String selectUserInfo(@RequestParam(defaultValue = "LeonShaw") String username) {
        if (users.get(username) != null) {
            return users.get(username).toString();
        } else {
            return "查询的用户不存在";
        }
    }

    @PostMapping("/updateUserInfo")
    public String updateUserInfo(Account userIn) {
        users.put(userIn.getUsername(), userIn);
        System.out.println(userIn.toString());
        return "用户" + userIn.getUsername() + "修改好了";
    }
}
