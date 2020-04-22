/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User2
 */
public class Gauge {
    private int value;
    
    public Gauge() {
        this.value = 0;
    }
    
    public void increase() {
        if(this.value == 5) {
            this.value = 5;
        } else {
            this.value++;
        }
    }
    
    public void decrease() {
        if(this.value < 1) {
            this.value = 0;
        } else {
            this.value--;
        }
    }
    
    public int value() {
        return this.value;
    }
    
    public boolean full(){
        if(this.value == 5) {
            return true;
        } else {
            return false;
        }
    }
}
