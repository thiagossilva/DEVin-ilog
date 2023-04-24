package tech.devinhouse.copadomundo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import tech.devinhouse.copadomundo.models.Papel;
import tech.devinhouse.copadomundo.models.Usuario;
import tech.devinhouse.copadomundo.services.UsuarioService;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class CopaDoMundoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CopaDoMundoApplication.class, args);
    }

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());
        return bean;
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }

    @Bean
    public PasswordEncoder obterPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UsuarioService usuarioService) {
        return args -> {  // inserting data after application is up
            if (usuarioService.consultar().isEmpty()) {
                usuarioService.criar(new Usuario(null, "jameskirk@enterprise.com", "abcd", LocalDate.now().minusYears(20), Arrays.asList(Papel.ADMINISTRADOR)));
                usuarioService.criar(new Usuario(null, "spock@enterprise.com", "abcd", LocalDate.now().minusYears(20), Arrays.asList(Papel.MANTENEDOR_TIMES)));
                usuarioService.criar(new Usuario(null, "mccoy@enterprise.com", "abcd", LocalDate.now().minusYears(20), Arrays.asList(Papel.MANTENEDOR_TIMES)));
            }
        };

    }

}