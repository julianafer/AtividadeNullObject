package service;

import model.GamerLaptop;
import model.Laptop;
import model.NormalLaptop;
import model.NullLaptop;

public final class LaptopFactory {

    public Laptop createLaptop(String tipo) {

        if (tipo == null) {
            return new NullLaptop();

        }
        
        tipo = tipo.toUpperCase();

        switch (tipo) {

            case "NORMAL":
                return new NormalLaptop();

            case "GAMER":
                return new GamerLaptop();

            default:
                return new NullLaptop();

        }
    }
}