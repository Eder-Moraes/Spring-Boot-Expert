package io.github.Eder_Moraes.ArquiteturaSpring.montadora.configuration;

import io.github.Eder_Moraes.ArquiteturaSpring.montadora.Motor;
import io.github.Eder_Moraes.ArquiteturaSpring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindro(4);
        motor.setLitragem(2.0);
        motor.setModelo("XPT-0");
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }
}
