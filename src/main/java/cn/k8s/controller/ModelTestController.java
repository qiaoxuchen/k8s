package cn.k8s.controller;

import cn.k8s.config.ConfigUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelTestController {

    @Autowired
    ConfigUtil configUtil;

    @RequestMapping("/get")
    public String get() {

        String platformType = configUtil.getPlatformType();
        String platformPwd = configUtil.getPlatformPwd();
        String userName = configUtil.getUserName();
        String userPwd = configUtil.getUserPwd();

        String str = "platformType=" + platformType + ";platformPwd=" + platformPwd + ";userName=" + userName + ";userPwd=" + userPwd;

        System.out.println(str);
        return str;
    }


}
