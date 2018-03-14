
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Sistema30
 */
public class StaticHelpers {
    
    
    
    public static Object[][] calc(float capital, float i, int n){
        Object[][] table=new Object[n+1][5];//n para el numero de meses, y 5 para n, amort, interes, cuota, capit.
        float cuota=(float)((capital)*(i)/(1-(Math.pow((1+i), -n))));//la cuota es fija
        float amortizable=0;
        for(int k=0;k<=n;k++){//k irá tomando el valor de n en forma incremental
            if(k==0){
                table[k][0]=k;
                table[k][1]="----";
                table[k][2]="----";
                table[k][3]="----";
                table[k][4]=capital;
            }else{
                float I=(float)(capital*(Math.pow((1+i), 1)-1));//ya que se  constantemente, k siempre sera igual 1
                table[k][0]=String.format("%d", k);
                table[k][1]=String.format("%.2f C$", I);
                amortizable=cuota-I;
                table[k][2]=String.format("%.2f C$", amortizable);
                table[k][3]=String.format("%.2f C$", cuota);
                capital-=amortizable;
                table[k][4]=String.format("%.2f C$", capital);
            }
        }
        return table;
    }
}
