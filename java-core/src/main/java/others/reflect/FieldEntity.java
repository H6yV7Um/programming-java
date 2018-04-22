package others.reflect;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yancy on 2018/3/28.
 */
@Getter
@Setter
public class FieldEntity {

    private String fieldname;

    private Object value;

    private Class clazz;

    private List<String> errorMsg = new ArrayList<String>();

    public FieldEntity() {
        super();
    }

    public FieldEntity(String fieldname, Object value, Class clazz) {
        this.fieldname = fieldname;
        this.value = value;
        this.clazz = clazz;
        this.errorMsg = errorMsg;
    }

    public FieldEntity(String fieldname, List<String> errorMsg) {
        this.fieldname = fieldname;
        this.value = value;
        this.clazz = clazz;
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "FieldEntity{" +
                "fieldname='" + fieldname + '\'' +
                ", value=" + value +
                ", clazz=" + clazz +
                ", errorMsg=" + errorMsg +
                '}';
    }
}
