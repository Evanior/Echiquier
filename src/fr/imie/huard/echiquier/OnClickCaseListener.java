package fr.imie.huard.echiquier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by huard.cdi04 on 01/03/2017.
 */
public class OnClickCaseListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println(((Case)actionEvent.getSource()).getPiece());
    }
}
