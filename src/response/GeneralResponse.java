package response;

import java.time.LocalDateTime;

public class GeneralResponse<T> {
    String message;
    LocalDateTime nowDate;
    T data;

    public GeneralResponse(String message, LocalDateTime nowDate, T data) {
        this.message = message;
        this.nowDate = nowDate;
        this.data = data;
    }

    public GeneralResponse() {
    }

    public GeneralResponse<T> of(String message, T data) {
        LocalDateTime nowData = LocalDateTime.now();
        System.out.println(message+nowData);
        return build(message, nowDate, data);

    }
    public GeneralResponse<T> of(String message) {
        LocalDateTime nowData = LocalDateTime.now();
        System.out.println(message+nowData);
        return build(message, nowDate, data);

    }

    private GeneralResponse<T> build(String message, LocalDateTime nowDate, T data) {
        return new GeneralResponse<>(message, nowDate, data);
    }

}