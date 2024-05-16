/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

public class LimitLoginException extends Exception {
    private int counterErrorLogin;

    public LimitLoginException(String message, int counterErrorLogin) {
        super(message);
        this.counterErrorLogin = counterErrorLogin;
    }

    public int getCounterErrorLogin() {
        return counterErrorLogin;
    }
}

