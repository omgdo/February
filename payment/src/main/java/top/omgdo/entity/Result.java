package top.omgdo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public static<T> Result success(T data){
        return new Result<>(200,"成功",data);
    }

    public static <T> Result failed(T data){
        return new Result<>(400,"失败",data);
    }

    public static <T> Result failed(String message,T data){
        return new Result<>(400,message,data);
    }


}
