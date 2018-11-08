package com.company;

import java.util.Scanner;

public class Ticket {

    int TicketNr;

    public void EnterTicket(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter ticket number");
        TicketNr = scan.nextInt();
        checkTicket();

    }

    private void checkTicket() {
        this.TicketNr=TicketNr;
        if (TicketNr % 19 ==0) {
            System.out.println("You won");
        } else System.out.println("Not this time :( try another one");
    }
}






