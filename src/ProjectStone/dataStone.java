/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectStone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author cHaRgE
 */
public class dataStone {
    
    static stone[] std = new stone[40];
    static int index = 0;
    static String[] strs = new String[40];
    static int indexStr = 0;
    
    public void readFile() throws IOException{
        String path = "src/ProjectStone/data.txt";
        String output = "";
        try{
            File fileDir = new File(path);
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir),"UTF8"));
            
            while((output=in.readLine())!=null){
                strs[indexStr++] = output;
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        inputAuto();
    }//end readFile()
    
    public void inputAuto(){
        String data, id="", name="", type="", pic="", detail="";
        stone s;
        for(int i=0; i<indexStr; i++){
            data = strs[i];
            StringTokenizer st = new StringTokenizer(data,",");
            int count = 0;
            while(st.hasMoreTokens()){
                String temp = st.nextToken();
                if(count == 0){
                    id = temp;
                }else if(count == 1){
                    name = temp;
                }else if(count == 2){
                    type = temp;
                }else if(count == 3){
                    pic = temp;
                }else{
                    detail = temp;
                    
                }
                count++;
            }
            s = new stone(id,name,type,pic,detail);
            input(s);
        }
    }//end inputAuto()
    
    public void input(stone s){
        std[index++] = s; 
    }
    
    
    public stone search(String id){
        boolean check = false;
        int i=0;
        while((i<index) && (!check)){
            if(std[i].getid().equals(id)){
                check = true;
            }else{
                i++;
            }
        }
        if(check){
            return std[i];
        }else{
            return null;
        }
    }//end search()
    
    public stone[] getStones(){
        return std;
    }
    public int getIndex(){
        return index;
    }
}//end class
