package tech.devinhouse.devgram;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import tech.devinhouse.devgram.models.Perfil;
import tech.devinhouse.devgram.models.Status;
import tech.devinhouse.devgram.services.PerfilService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class DevgramApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevgramApplication.class, args);
    }

    @Bean
    CommandLineRunner run(PerfilService perfilService) {
        return args -> {
            List<Perfil> lista = perfilService.consultar(100, 0, "nome", "ASC");
            if (lista.isEmpty()) {
                perfilService.criar(new Perfil("Thiago", "bio do Thiago", LocalDate.now().minusYears(25),
                        "dev", LocalDateTime.now(), LocalDateTime.now(), Status.ATIVO));
                perfilService.criar(new Perfil("Junim", "bio do Junim", LocalDate.now().minusYears(23),
                        "dev", LocalDateTime.now(), LocalDateTime.now(), Status.PENDENTE));
            }
        };
    }

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        return bean;
    }

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

}


