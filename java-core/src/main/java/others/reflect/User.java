package others.reflect;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by yancy on 2018/3/28.
 */
@Setter
@Getter
public class User {
    private transient String username;
    private String password;
    private String eBlog;
    private Date registrationDate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteBlog() {
        return eBlog;
    }

    public void seteBlog(String eBlog) {
        this.eBlog = eBlog;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
