/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apontamento.controller;

import apontamento.view.LoginForm;
import apontamento.view.PrincipalForm;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class LoginController {

    private final LoginForm view;

    int xx, xy;

    public LoginController(LoginForm view) {
        this.view = view;
    }

    public void teste() {
        view.getTxtLogin().getText();
        JOptionPane.showMessageDialog(view, "O TEXTO É: " + view.getTxtLogin().getText());
    }

    public void chamaPrincipal() {
        PrincipalForm t = new PrincipalForm();
        t.setVisible(true);
        view.dispose();
    }

    public void localAtual(java.awt.event.MouseEvent evt) {
        xx = evt.getX();
        xy = evt.getY();
    }

    public void moveLocal(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        view.setLocation(x - xx, y - xy);
    }
}
