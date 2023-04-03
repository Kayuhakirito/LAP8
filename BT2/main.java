/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

/**
 *
 * @author kayuh
 */
public class main {
    public static void main(String[] args) {
        xeDap xd = new xeDap("xxx", "zzz","ccc");
        xeOTo oto = new xeOTo();
        MayBay mb = new MayBay();
        xd.layVanToc();
        oto.layVanToc();
        mb.layVanToc();
        mb.catCanh();
        mb.haCanh();
                }
}