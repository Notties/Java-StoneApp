/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectStone;

import java.io.IOException;

/**
 *
 * @author cHaRgE
 */
public class mainStone {
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        dataStone dt = new dataStone();
        dt.readFile();
        new Home().setVisible(true);
    }
}
