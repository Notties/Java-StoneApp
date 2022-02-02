/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectStone;

/**
 *
 * @author cHaRgE
 */
public class stone {
    
    public String id;
    public String name;
    public String type;
    public String pic;
    public String detail;
    
   /* public stone(){
        this.id = id;
        this.name = name;
        this.type = type;
        this.pic = pic;
        this.detail = detail;
    }*/
    public stone(String id, String name, String type, String pic, String detail){
        this.id = id;
        this.name = name;
        this.type = type;
        this.pic = pic;
        this.detail = detail;
    }//end Constructor
    
    public String getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String gettype(){
        return type;
    }
    public String getpic(){
        return pic;
    }
    public String getdetail(){
        return detail;
    }
    
}//end stone()
