package com.example.backend.model.payload;

public class AuthResponse {
    private String status;

    public AuthResponse(String status) {
        this.status = status;
    }

    public static AuthResponse success(){return new AuthResponse("Ok");}
    public static AuthResponse error(){return new AuthResponse("KO");}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
