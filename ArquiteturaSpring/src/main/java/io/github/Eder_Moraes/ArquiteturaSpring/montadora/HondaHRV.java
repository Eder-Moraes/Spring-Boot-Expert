package io.github.Eder_Moraes.ArquiteturaSpring.montadora;

import java.awt.*;

public class HondaHRV extends Carro{

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setColor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }

}
