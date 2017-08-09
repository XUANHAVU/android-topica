package tmei.studio.model;

import java.io.Serializable;

/**
 * Created by vuxua on 9/6/2016.
 */
public class DanhBa implements Serializable {
    private int code;
    private String name;
    private String phone;

    public DanhBa() {
    }

    public DanhBa(int code, String name, String phone) {

        this.code = code;
        this.name = name;
        this.phone = phone;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
