package top.omgdo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 *
 */
@Data
@TableName("payment")
public class Payment {

    @TableId(type= IdType.AUTO)
    private int id;
    private String serial;
}
