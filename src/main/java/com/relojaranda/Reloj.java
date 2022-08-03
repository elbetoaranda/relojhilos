package com.relojaranda;

import java.util.Calendar;

public class Reloj extends Thread{

    public void run(){
        try {
            while(true){
                Calendar c = Calendar.getInstance();
                int hora = c.get(Calendar.HOUR);
                int minuto = c.get(Calendar.MINUTE);
                int segundo = c.get(Calendar.SECOND);

                String tiempo = hora +":"+ minuto +":"+segundo;
                System.out.println(tiempo);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo");
        }
    }

    public static void main(String[] args){
        Reloj reloj = new Reloj();
        reloj.start();
    }
}
