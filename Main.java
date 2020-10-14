package com.company;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,x,y,sum=0;
        float ma;
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Cate numere introduceti" ));
        for(i=1;i<=x;i++){
            y=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduceti valoarea "+i+":" ));
            sum=sum+y;
        }
        ma=(float)sum/x;
        JOptionPane.showMessageDialog(null,"Media aritmetica este: " + ma);
    }
}
