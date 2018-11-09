package mx.edu.uttt.generic;

import mx.edu.uttt.view.frmLogin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BONI
 */
public class SingletonLogin {
    //primero un constructor
    //el constructor esta vacio
    public SingletonLogin() {
    }
    /*
    Realmente este es quien se encarga de hacer la instancia de los objetis solo una
    */
    public static frmLogin getInstance(){
        return ObjectLoginInstance.INSTANCE_LOGIN;
    }
    //este metodo se encarga de crear un jframe del login
    private static class ObjectLoginInstance{
        private static final frmLogin INSTANCE_LOGIN= new frmLogin();
    }
    
}
