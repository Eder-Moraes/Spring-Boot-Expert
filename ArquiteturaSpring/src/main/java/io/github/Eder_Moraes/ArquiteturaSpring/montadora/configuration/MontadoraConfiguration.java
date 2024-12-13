package io.github.Eder_Moraes.ArquiteturaSpring.montadora.configuration;

import io.github.Eder_Moraes.ArquiteturaSpring.montadora.Motor;
import io.github.Eder_Moraes.ArquiteturaSpring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindro(4);
        motor.setLitragem(2.0);
        motor.setModelo("XPT-0");
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindro(3);
        motor.setLitragem(1.4);
        motor.setModelo("TH-10");
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindro(4);
        motor.setLitragem(1.5);
        motor.setModelo("TH-20");
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
