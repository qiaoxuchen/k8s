package cn.k8s.config;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@Getter
public class ConfigUtil {

    @Value("#{'${platform.type}'}")
    public String platformType;

    @Value("#{'${platform.pwd}'}")
    public String platformPwd;

    @Value("#{'${user.name}'}")
    public String userName;

    @Value("#{'${user.pwd}'}")
    public String userPwd;
    
    
}
