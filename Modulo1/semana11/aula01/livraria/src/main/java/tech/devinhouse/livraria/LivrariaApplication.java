package tech.devinhouse.livraria;

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
import tech.devinhouse.livraria.models.Role;
import tech.devinhouse.livraria.models.Usuario;
import tech.devinhouse.livraria.services.UsuarioService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class LivrariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivrariaApplication.class, args);
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
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UsuarioService usuarioService) {
		return args -> {
			List<Usuario> lista = usuarioService.listar();
			if (lista.isEmpty()) {
				usuarioService.criar(new Usuario(null, "jameskirk@enterprise.com", "abcd", LocalDate.now().minusYears(20), Arrays.asList(Role.ROLE_ADMIN)));
				usuarioService.criar(new Usuario(null, "spock@enterprise.com", "abcd", LocalDate.now().minusYears(20), Arrays.asList(Role.ROLE_FUNCIONARIO, Role.ROLE_ADMIN)));
				usuarioService.criar(new Usuario(null, "mccoy@enterprise.com", "abcd", LocalDate.now().minusYears(20), Arrays.asList(Role.ROLE_LEITOR)));
				usuarioService.criar(new Usuario(null, "scott@enterprise.com", "abcd", LocalDate.now().minusYears(20), Arrays.asList(Role.ROLE_FUNCIONARIO)));
			}
		};
	}
}
